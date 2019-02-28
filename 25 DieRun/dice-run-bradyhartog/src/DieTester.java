/**
 * Tests the DieArray class, printing the entire sequence and indicating the maximum run.
 */

public class DieTester {
    public static void main(String[] args) {
        DieArray dieArray = new DieArray();
        dieArray.addValues();
        dieArray.readRun();
        dieArray.findMaxRun();
        if (dieArray.info[0] != 0) {
            for (int i = 0; i < dieArray.values.length; i++) {
                if (i == 0) {
                    if (i == dieArray.maxStart) {
                        System.out.print("(" + dieArray.values[i]);
                    }
                    else {
                        System.out.print(dieArray.values[i]);
                    }
                }
                else {
                    if (i == dieArray.maxStart) {
                        System.out.print(" (" + dieArray.values[i]);
                    }
                    else if (i == dieArray.maxEnd) {
                        System.out.print(" " + dieArray.values[i] + ")");
                    }
                    else {
                        System.out.print(" " + dieArray.values[i]);
                    }
                }
            }
        }
        else {
            System.out.print(dieArray.values[0]);
            for (int i = 1; i < dieArray.values.length; i++) {
                System.out.print(" " + dieArray.values[i]);
            }
        }
        System.out.println();
    }
}