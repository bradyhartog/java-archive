/**
 * Uses "if" decision-making to convert from Arabic to Roman numerals
 */
public class Converter {
    /**
     * Allowing for input
     */
    private int input;

    /**
     * Constructs a converter
     * @param input the Arabic input
     */
    public Converter(int input) {
        this.input = input;
    }

    /**
     * Analyzes the input digit-by-digit to convert to a Roman numeral
     * @return the equivalent Roman numeral
     */
    public String getNumeral() {
        int digit1 = 0;
        int digit2 = 0;
        int digit3 = 0;
        int digit4 = 0;
        String rm1 = "";
        String rm2 = "";
        String rm3 = "";
        String rm4 = "";
        if (input % 10 == 0) {
            digit1 = 0;
            rm1 = "";
        }
        if ((input - 1) % 10 == 0) {
            digit1 = 1;
            rm1 = "I";
        }
        if ((input - 2) % 10 == 0) {
            digit1 = 2;
            rm1 = "II";
        }
        if ((input - 3) % 10 == 0) {
            digit1 = 3;
            rm1 = "III";
        }
        if ((input - 4) % 10 == 0) {
            digit1 = 4;
            rm1 = "IV";
        }
        if ((input - 5) % 10 == 0) {
            digit1 = 5;
            rm1 = "V";
        }
        if ((input - 6) % 10 == 0) {
            digit1 = 6;
            rm1 = "VI";
        }
        if ((input - 7) % 10 == 0) {
            digit1 = 7;
            rm1 = "VII";
        }
        if ((input - 8) % 10 == 0) {
            digit1 = 8;
            rm1 = "VIII";
        }
        if ((input - 9) % 10 == 0) {
            digit1 = 9;
            rm1 = "IX";
        }
        if (input >= 10) {
            if ((input - digit1) % 100 == 0) {
                digit2 = 0;
                rm2 = "";
            }
            if ((input - digit1 - 10) % 100 == 0) {
                digit2 = 10;
                rm2 = "X";
            }
            if ((input - digit1 - 20) % 100 == 0) {
                digit2 = 20;
                rm2 = "XX";
            }
            if ((input - digit1 - 30) % 100 == 0) {
                digit2 = 30;
                rm2 = "XXX";
            }
            if ((input - digit1 - 40) % 100 == 0) {
                digit2 = 40;
                rm2 = "XL";
            }
            if ((input - digit1 - 50) % 100 == 0) {
                digit2 = 50;
                rm2 = "L";
            }
            if ((input - digit1 - 60) % 100 == 0) {
                digit2 = 60;
                rm2 = "LX";
            }
            if ((input - digit1 - 70) % 100 == 0) {
                digit2 = 70;
                rm2 = "LXX";
            }
            if ((input - digit1 - 80) % 100 == 0) {
                digit2 = 80;
                rm2 = "LXXX";
            }
            if ((input - digit1 - 90) % 100 == 0) {
                digit2 = 90;
                rm2 = "XC";
            }
        }
        if (input >= 100) {
            if ((input - digit1 - digit2) % 1000 == 0) {
                digit3 = 0;
                rm3 = "";
            }
            if ((input - digit1 - digit2 - 100) % 1000 == 0) {
                digit3 = 100;
                rm3 = "C";
            }
            if ((input - digit1 - digit2 - 200) % 1000 == 0) {
                digit3 = 200;
                rm3 = "CC";
            }
            if ((input - digit1 - digit2 - 300) % 1000 == 0) {
                digit3 = 300;
                rm3 = "CCC";
            }
            if ((input - digit1 - digit2 - 400) % 1000 == 0) {
                digit3 = 400;
                rm3 = "CD";
            }
            if ((input - digit1 - digit2 - 500) % 1000 == 0) {
                digit3 = 500;
                rm3 = "D";
            }
            if ((input - digit1 - digit2 - 600) % 1000 == 0) {
                digit3 = 600;
                rm3 = "DC";
            }
            if ((input - digit1 - digit2 - 700) % 1000 == 0) {
                digit3 = 700;
                rm3 = "DCC";
            }
            if ((input - digit1 - digit2 - 800) % 1000 == 0) {
                digit3 = 800;
                rm3 = "DCCC";
            }
            if ((input - digit1 - digit2 - 900) % 1000 == 0) {
                digit3 = 900;
                rm3 = "CM";
            }
        }
        if (input >= 1000) {
            if ((input - digit1 - digit2 - digit3) % 10000 == 0) {
                digit4 = 0;
                rm4 = "";
            }
            if ((input - digit1 - digit2 - digit3 - 1000) % 10000 == 0) {
                digit4 = 1000;
                rm4 = "M";
            }
            if ((input - digit1 - digit2 - digit3 - 2000) % 10000 == 0) {
                digit4 = 2000;
                rm4 = "MM";
            }
            if ((input - digit1 - digit2 - digit3 - 3000) % 10000 == 0) {
                digit4 = 3000;
                rm4 = "MMM";
            }
        }
        return rm4 + rm3 + rm2 + rm1;
    }
}