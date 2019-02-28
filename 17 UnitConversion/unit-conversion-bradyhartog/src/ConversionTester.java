/**
 * Tests the Distance, Weight, and Volume classes for converting among various units of measure
 */

import java.util.Scanner;

public class ConversionTester {
    public static void main(String[] args) {
        System.out.println("Unit Converter v1.0");
        System.out.println("© 2017 Hartog Systems, Inc.");
        System.out.println("");
        System.out.println("Select conversion type: ");
        System.out.println("Distance (ds) | Weight (wt) |  Volume (vl)");
        Scanner in = new Scanner(System.in);
        String cnvsnType = in.nextLine();
        System.out.println("");
        int testDs = cnvsnType.compareTo("ds");
        int testWt = cnvsnType.compareTo("wt");
        int testVl = cnvsnType.compareTo("vl");
        if (testDs == 0) {
            System.out.println("From: in | ft | mi | cm | m | km");
            String typeIn = in.nextLine();
            System.out.println("To:   in | ft | mi | cm | m | km");
            String typeOut = in.nextLine();
            System.out.println("");
            System.out.printf("Value (%s): ", typeIn);
            double input = in.nextDouble();
            Distance distance = new Distance(typeIn, typeOut, input);
            System.out.printf("Output (%s): ", typeOut);
            System.out.print(distance.getCnvsn());
            System.out.println("");
        }
        if (testWt == 0) {
            System.out.println("From: oz | lb | g | kg");
            String typeIn = in.nextLine();
            System.out.println("To:   oz | lb | g | kg");
            String typeOut = in.nextLine();
            System.out.println("");
            System.out.printf("Value (%s): ", typeIn);
            double input = in.nextDouble();
            Weight weight = new Weight(typeIn, typeOut, input);
            System.out.printf("Output (%s): ", typeOut);
            System.out.print(weight.getCnvsn());
            System.out.println("");
        }
        if (testVl == 0) {
            System.out.println("From: fl oz | gal | ml | l");
            String typeIn = in.nextLine();
            System.out.println("To:   fl oz | gal | ml | l");
            String typeOut = in.nextLine();
            System.out.println("");
            System.out.printf("Value (%s): ", typeIn);
            double input = in.nextDouble();
            Volume volume = new Volume(typeIn, typeOut, input);
            System.out.printf("Output (%s): ", typeOut);
            System.out.print(volume.getCnvsn());
            System.out.println("");
        }
        if (testDs != 0 && testWt != 0 && testVl != 0) {
            System.out.println("Please restart and enter a valid conversion type.");
        }
    }
}