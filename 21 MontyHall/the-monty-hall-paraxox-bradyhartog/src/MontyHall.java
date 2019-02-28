/**
 * Simulates the classic Monty Hall Paradox, determining a player's odds of winning when they stay versus when they switch.
 */

import java.util.concurrent.ThreadLocalRandom;

public class MontyHall {
    /**
     * Constructs a Monty Hall object.
     */
    public MontyHall() {}

    /**
     * Determines the player's odds of winning when they choose to keep their selection.
     * @return the odds of winning when the player stays
     */
    public static double runStayShow() {
        double stayCount = 0;
        for (int i = 0; i < 1000000; i++) {
            int car = ThreadLocalRandom.current().nextInt(1, 4);
            int pick = ThreadLocalRandom.current().nextInt(1, 4);
            if (pick == car) stayCount++;
        }
        return stayCount / 10000;
    }

    /**
     * Determines the player's odds of winning when they choose to switch their selection.
     * @return the odds of winning when the player switches
     */
    public static double runSwitchShow() {
        double switchCount = 0;
        for (int i = 0; i < 1000000; i++) {
            int car = ThreadLocalRandom.current().nextInt(1, 4);
            int pick = ThreadLocalRandom.current().nextInt(1, 4);
            if (pick != car) switchCount++;
        }
        return switchCount / 10000;
    }
}