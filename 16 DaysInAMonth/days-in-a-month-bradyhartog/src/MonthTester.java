/**
 * Tests the Month class for determining number of days in a month
 */
import java.util.Scanner;

public class MonthTester {
    public static void main(String[] args) {
        System.out.println("Enter month number: ");
        Scanner in = new Scanner(System.in);
        int monthNum = Integer.parseInt(in.nextLine());
        Month month = new Month(monthNum);
        System.out.printf("There are %d days in that month.", month.getLength());
    }
}