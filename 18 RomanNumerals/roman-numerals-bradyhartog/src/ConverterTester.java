/**
 * Tests the Converter class for converting from Arabic to Roman numerals
 */

import java.util.Scanner;

public class ConverterTester {
    public static void main(String[] args) {
        System.out.println("Roman Numeral Converter v1.0");
        System.out.println("© 2017 Hartog Systems, Inc.");
        System.out.println("");
        System.out.print("Enter number:  ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        if (input > 0 && input < 4000) {
            Converter converter = new Converter(input);
            System.out.printf("Roman numeral: %s", converter.getNumeral());
            System.out.println("");
        }
        else {
            System.out.println("");
            System.out.println("Please restart and enter a valid number (0 < x < 4000).");
        }
    }
}