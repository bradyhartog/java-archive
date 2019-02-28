/*
   A robust IR communications protocol for Arduino. Will transmit
   and receive messages in spite of blocking interference,
   extraneous IR interference, and simultaneous messages from
   the partnering board.

   Kelsey Tyler and Brady Hartog
   06 December 2018
*/

// GLOBAL VARIABLES

double d                = 0.5;  // Number of milliseconds in each pulse.
bool   transmitting_IR;         // Whether this board is currently transmitting.
bool   receiving_IR;            // Whether this board is currently receiving.
int    serial           = 0;    // The serial number for messages sent from this board.
int    prev_serial      = 1;    // The most previous serial message number.
int    serial_check     = -2;   // For holding the serial number to confirm.
int    read_code        = 0;
int    code             = -1;
// HELPER FUNCTIONS

/*
   Turns off the infrared LED (the transmitter).
*/
void turn_off_IR() {
  // Instead of just adjusting the output on pin 11, this code also
  //   turns off the timer controlling the PWM output on pin 11.

  TCCR2A = 0;  // Disconnect PWM
  TCCR2B = 0;  // Stops the timer
  OCR2A = 0;   // No timer top
  digitalWrite(11, LOW);  // Ensure output is off

  transmitting_IR = false;
}

/*
   Turns on the infrared LED (the transmitter). Note that it
   should remain on for at least 8 periods of a 38 kHz signal,
   or the receivers may not detect it. (211 us)
*/
void turn_on_IR() {
  // Set up Timer2 (which can be connected to pins 3 and 11).
  // For full details, see:
  //   arduino.cc/en/Tutorial/SecretsOfArduinoPWM
  // The syntax here has me baffled, but the patterns of usage
  //   are clear if you look at the ATMega328 diagrams.
  //   _BV appears to stand for 'bit value.'
  //   Different bits need to be set to control each timer.
  //   Refer to diagrams for clarity.

  TCCR2A = _BV(WGM21) | _BV(COM2A0);  // This mode toggles output once per timer cycle.
  TCCR2B = _BV(CS20);  // Do not scale the clock down--use 16 MHz timer rate.
  OCR2A = 210;  // Divide sys. clock by 210, 1/2 cycle = 76 khz, 1 cycle = 38 khz.

  // Output pin 11 should now be emitting a 38 khz signal.

  transmitting_IR = true;
}

/*
   Returns true iff the infrared receiver is detecting a 38 kHz
   infrared signal. (See the datasheet for this part for additional
   requirements.)
*/
bool detect_IR() {
  // Determine if we are receiving an IR signal.
  //   if pin 12 is false = receiving
  //   if pin 12 is true = not receiving

  return receiving_IR = (!digitalRead(12));
}

// SETUP

void setup() {
  Serial.begin(9600);

  pinMode (4, INPUT);      // Button
  digitalWrite (4, HIGH);  // Button pull-up resistor

  pinMode (11, OUTPUT);  // IR LED
  pinMode (12, INPUT);   // IR receiver

  turn_off_IR();  // Helper function for controlling the IR LED.
  detect_IR();    // Ensure the state is correct.

  randomSeed(analogRead(A0));  // Seed the random number generator.
}

// LOOP

void loop() {
  // Check to see if we need to send a message.
if(read_code == 0)
  code = Serial.read();
  else{
    read_code = 0;
  }

  if (code >= 0) {
    send_message((char)code);  // Send the message.
    long long send_start = millis();

    char verify = receive_character();  // Check for verification.

    // As long as the message cannot be verified, continue to
    //   attempt to send it.

    while (verify != code) {
      send_message((char)code);

      if (detect_IR())
        verify = receive_character();

      // A random delay before each message attempt protects against
      //   conflicts between simultaneous outgoing messages.

      delayMicroseconds(random(100, 200)*d);
      long long send_time = millis();

      if (send_time - send_start > 1000) {
        read_code = 1;
        verify = code;
      }
    }

    if (read_code == 0)
      serial++;  // Increment the serial number after a successful
                 //   message receipt.
  }

  // Check to see if we are receiving a message. Limit the time
  //   interval in which a message must be successfully received--
  //   otherwise move on.

  long long wait_time = millis();     // The time waited for the next message.
  long long receive_time = millis();  // The time in which the last message was received.

  while (wait_time - receive_time < 50) {
    if (detect_IR()) {
      receive_message();
      receive_time = millis();
    }
    wait_time = millis();
  }
}

/*
   Sends a series of IR pulses (as a serial
   message) that transmits this character to another
   Arduino board. A start bit is sent, and then
   the bits of the message are sent in LSB to MSB order.
   IR on = high bit.

   All 8 bits of the character are sent.

   param ch -- the character to send
*/
void send_character(char ch) {
  // Send a start bit and wait.

  turn_on_IR();
  delayMicroseconds((int)(d * 1000));

  // Send the 8 bits of the character, pausing
  //   between each bit.

  for (int bitPos = 0; bitPos <= 7; bitPos++) {
    int bit = (ch >> bitPos) & 1;
    if (bit == 1)
      turn_on_IR();
    else
      turn_off_IR();

    delayMicroseconds((int)(d * 1000));
  }

  // Quiet period.

  turn_off_IR();
  delayMicroseconds((int)(d * 1000));
}

/*
   This function assumes that a start bit
   has been detected. The function waits
   for and detects the bits of the character,
   then reassembles the bits and returns the
   character.
*/
char receive_character() {
  char result = 0;

  // Wait to the center of the first bit.

  delayMicroseconds((int)(d * 1000 * 1.5));

  // Sample and reassemble the bits, wait for the
  //   bit after each bit.

  for (int bitPos = 0; bitPos <= 7; bitPos++) {
    int bit = detect_IR() ? 1 : 0;
    result = result | (bit << bitPos);
    delayMicroseconds((int)(d * 1000));
  }

  return result;
}

/*
   Sends a character as part of a package, including
   a start bit ('2'), the character to send, the
   message's serial number (in quantity two, to aid in
   verification), and the checksum of all these bits.

   param ch -- the character to send
*/
void send_message(char ch) {
  send_character(2);
  send_character(ch);
  send_character(serial);
  send_character(serial);
  send_character(2 + ch + serial);
}

/*
   Receives the package transmitted by the send_message
   function. Will only proceed if it can confirm the
   start bit ('2'). Verifies the serial number of the
   package as well as its checksum.
*/
void receive_message() {
  char test = receive_character();

  // Proceed only if the perceived start bit is 2.

  if (test == 2) {
    delayMicroseconds((int)(d * 0.5 * 1000));
    char ch = receive_character();

    prev_serial = serial_check;

    delayMicroseconds((int)(d * 0.5 * 1000));
    char serial_check1 = receive_character();

    delayMicroseconds((int)(d * 0.5 * 1000));
    char serial_check2 = receive_character();

    delayMicroseconds((int)(d * 0.5 * 1000));
    char checksum = receive_character();

    // Verify the serial number.

    if (serial_check1 == serial_check2) {
      serial_check2 = serial_check;
      serial_check = serial_check1;
    }

    // Construct and verify the checksum.

    char test_checksum = test + ch + serial_check;

    if (test_checksum != checksum) {
      serial_check = serial_check2;
      test_checksum = test + ch + serial_check;
    }

    // If all tests pass, send the character as confirmation and
    //   print it out.

    if (checksum == test_checksum) {
      send_character(ch);

      if (prev_serial != serial_check)
        Serial.print((char)ch);
    }
  }
}
