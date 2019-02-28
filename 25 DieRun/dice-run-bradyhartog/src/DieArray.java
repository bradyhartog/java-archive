/**
 * Simulates a sequence of 20 random die tosses and identifies the longest run of congruent values.
 */

import java.util.Random;

public class DieArray {
    int[] values = new int[20];
    int[] info = new int[30];
    int maxStart = 0;
    int maxEnd = 0;

    /**
     * Constructs a DieArray object.
     */
    public DieArray() {}

    Random die = new Random();

    /**
     * Generates the sequence and stores it in the values array.
     */
    public void addValues() {
        for (int i = 0; i < values.length; i++) {
            values[i] = die.nextInt(6) + 1;
        }
    }

    /**
     * Analyzes the sequence to determine the lengths and positions of all congruent runs, storing them in the info array.
     */
    public void readRun() {
        int length = 1;
        int firstIndex = 0;
        int lastIndex = 0;
        int infoPos = 0;
        boolean runOn = false;
        for (int i = 1; i < values.length; i++) {
            if (runOn) {
                if (values[i] - values[i - 1] != 0) {
                    lastIndex = i - 1;
                    runOn = false;
                    info[infoPos] = length;
                    info[infoPos + 1] = firstIndex;
                    info[infoPos + 2] = lastIndex;
                    infoPos = infoPos + 3;
                    length = 1;
                }
                else {
                    length++;
                    if (i == values.length - 1) {
                        lastIndex = i;
                        info[infoPos] = length;
                        info[infoPos + 1] = firstIndex;
                        info[infoPos + 2] = lastIndex;
                    }
                }
            }
            else if (values[i] - values[i - 1] == 0) {
                length++;
                firstIndex = i - 1;
                runOn = true;
                if (i == values.length - 1) {
                    lastIndex = i;
                    info[infoPos] = length;
                    info[infoPos + 1] = firstIndex;
                    info[infoPos + 2] = lastIndex;
                }
            }
        }
    }

    /**
     * Analyzes the info array to determine the length and position of the (initial) maximum run.
     */
    public void findMaxRun() {
        int maxIndex = 0;
        maxStart = info[1];
        maxEnd = info[2];
        for (int i = 3; i < info.length; i = i + 3) {
            if (info[i] > info[maxIndex]) {
                maxIndex = i;
                maxStart = info[i + 1];
                maxEnd = info[i + 2];
            }
        }
    }
}