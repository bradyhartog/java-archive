/**
 * Tests the Monty Hall class.
 */

public class MontyHallTester {
    public static void main(String[] args) {
        MontyHall montyHall = new MontyHall();
        System.out.println("Player Stays:    " + montyHall.runStayShow() + "%");
        System.out.println("Player Switches: " + montyHall.runSwitchShow() + "%");
    }
}