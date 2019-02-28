/**
 * A class to simulate an oyster bar, accommodating arrivals and departures and a maximum capacity of 100.
 */

public class OysterBar {
    int occupants = 0;
    boolean done = false;

    /**
     * Constructs an OysterBar class.
     */
    public OysterBar() {
        this.occupants = occupants;
        this.done = done;
    }

    /**
     * Modifies the occupants of the OysterBar, or rejects the arriving or departing group if it exceeds the capacity. Terminates if the capacity reaches maximum.
     * @param groupSize
     * @return the appropriate response
     */
    public String modifyOccupants(int groupSize) {
        String output = "";
        if (occupants + groupSize < 100 && occupants + groupSize >= 0) {
            occupants = occupants + groupSize;
            output = "Current occupants: " + occupants;
        }
        else if (occupants + groupSize > 100) {
            output =  "Group is too large to add.";
        }
        else if (occupants + groupSize < 0) {
            output =  "Group is too large to subtract.";
        }
        else if (occupants + groupSize == 100) {
            done = true;
            output =  "The OysterBar is full. See you next time!";
        }
        return output;
    }

    /**
     * Indicates a "done" status if the bar reaches maximum capacity.
     * @return
     */
    public boolean getStatus() {
        return done;
    }
}