package assignment09;

import java.util.Scanner;

/**
 * Makes conversions among various units of distance: in, ft, cm, m
 */
public class Convert {
    public static void main(String[] args) {
        System.out.println("Distance Converter v1.0");
        System.out.println("© 2018 Hartog Systems, Inc.");
        System.out.println("");
        System.out.println("Make conversion from: in | ft | cm | m");
        Scanner in = new Scanner(System.in);
        String typeIn = in.nextLine();
        System.out.println("To:   in | ft | cm | m");
        String typeOut = in.nextLine();
        System.out.println("");
        System.out.printf("Value (%s): ", typeIn);
        double input = in.nextDouble();
        double output = getConversion(typeIn, typeOut, input);
        System.out.printf("Output (%s): ", typeOut);
        System.out.print(output);
        System.out.println("");
    }

    /**
     * Converts among any of the units of distance
     * @return the converted value
     */
    private static double getConversion(String typeIn, String typeOut, double input) {
        double output = 0;
        if (typeIn.compareTo("in") == 0) {
            if (typeOut.compareTo("in") == 0) output = input;
            if (typeOut.compareTo("ft") == 0) output = input / 12;
            if (typeOut.compareTo("cm") == 0) output = input * 2.54;
            if (typeOut.compareTo("m") == 0) output = input * 0.0254;
        }
        if (typeIn.compareTo("ft") == 0) {
            if (typeOut.compareTo("in") == 0) output = input * 12;
            if (typeOut.compareTo("ft") == 0) output = input;
            if (typeOut.compareTo("cm") == 0) output = input * 30.48;
            if (typeOut.compareTo("m") == 0) output = input * 0.3048;
        }
        if (typeIn.compareTo("cm") == 0) {
            if (typeOut.compareTo("in") == 0) output = input / 2.54;
            if (typeOut.compareTo("ft") == 0) output = input / 30.48;
            if (typeOut.compareTo("cm") == 0) output = input;
            if (typeOut.compareTo("m") == 0) output = input / 100;
        }
        if (typeIn.compareTo("m") == 0) {
            if (typeOut.compareTo("in") == 0) output = input * 39.37;
            if (typeOut.compareTo("ft") == 0) output = input * 3.28;
            if (typeOut.compareTo("cm") == 0) output = input * 100;
            if (typeOut.compareTo("m") == 0) output = input;
        }
        return output;
    }
}