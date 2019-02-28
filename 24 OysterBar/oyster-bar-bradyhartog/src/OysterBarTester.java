/**
 * Tests the OysterBar class.
 */

import java.util.Scanner;

public class OysterBarTester {
    public static void main(String[] args) {
        System.out.println("Welcome to the OysterBar!");
        System.out.println("");
        OysterBar oysterBar = new OysterBar();
        Scanner in = new Scanner(System.in);
        while (!oysterBar.getStatus()) {
            System.out.print("Enter arrival/departure size (+/-): ");
            int groupSize = in.nextInt();
            System.out.println(oysterBar.modifyOccupants(groupSize));
            System.out.println("");
        }
    }
}