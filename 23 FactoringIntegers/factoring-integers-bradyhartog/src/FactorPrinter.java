/**
 * Tests the FactorGenerator class, accepting input for an integer and printing its factors, or PRIME if prime.
 */

import java.util.Scanner;

public class FactorPrinter {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner in = new Scanner(System.in);
        int integer = in.nextInt();
        FactorGenerator factorGenerator = new FactorGenerator(integer);
        System.out.println("");
        System.out.println("Factors: " + factorGenerator.getFactors());
    }
}