import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Tests the Floats class by providing for input for a series of floating point numbers.
 */
public class Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        Floats floats = new Floats();
        while(!done) {
            System.out.print("Enter a floating-point number, or -1 to advance: ");
            try {
                done = floats.addFloat(in.nextDouble());
            } catch (InputMismatchException ex) {
                System.out.print("Oops, try again: ");
                in.next();
                try {
                    done = floats.addFloat(in.nextDouble());
                } catch (InputMismatchException ex1) {
                    in.next();
                    done = floats.addFloat(0.0);
                }
            }
        }
        System.out.println();
        System.out.println("Your sum is: " + floats.sum());
    }
}