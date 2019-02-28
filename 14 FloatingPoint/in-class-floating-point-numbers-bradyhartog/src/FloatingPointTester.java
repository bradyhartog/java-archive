import java.util.Scanner;

public class FloatingPointTester {
    public static void main(String[] args) {
        double number = getValue();
        FloatingPoint myFloat = new FloatingPoint(number);
        System.out.printf("The number %f is %s %s", number, myFloat.getSign(), myFloat.getSize());
    }

    public static double getValue() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a floating point number: ");
        if (!in.hasNextDouble()) {
            System.out.println("You did not enter a float. Bye.");
            System.exit(0);
        }
        return in.nextDouble();
    }
}
