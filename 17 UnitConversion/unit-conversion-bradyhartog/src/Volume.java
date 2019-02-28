/**
 * Makes conversions among various units of volume: fl oz, gal, ml, l
 */
public class Volume {
    /**
     * Creating input for starting unit, target unit, and starting value
     */
    private String typeIn;
    private String typeOut;
    private double input;

    /**
     * Constructs a converter for the units of volume
     * @param typeIn the starting unit
     * @param typeOut the target unit
     * @param input the starting value
     */
    public Volume(String typeIn, String typeOut, double input) {
        this.typeIn = typeIn;
        this.typeOut = typeOut;
        this.input = input;
    }

    /**
     * Converts among any of the units of volume
     * @return the converted value
     */
    public double getCnvsn() {
        double output = 0;
        if (typeIn.compareTo("fl oz") == 0) {
            if (typeOut.compareTo("fl oz") == 0) output = input;
            if (typeOut.compareTo("gal") == 0) output = input / 128;
            if (typeOut.compareTo("ml") == 0) output = input * 29.57;
            if (typeOut.compareTo("l") == 0) output = input / 33.81;
        }
        if (typeIn.compareTo("gal") == 0) {
            if (typeOut.compareTo("fl oz") == 0) output = input * 128;
            if (typeOut.compareTo("gal") == 0) output = input;
            if (typeOut.compareTo("ml") == 0) output = input * 3785.4;
            if (typeOut.compareTo("l") == 0) output = input * 3.785;
        }
        if (typeIn.compareTo("ml") == 0) {
            if (typeOut.compareTo("fl oz") == 0) output = input / 29.57;
            if (typeOut.compareTo("gal") == 0) output = input / 3785.4;
            if (typeOut.compareTo("ml") == 0) output = input;
            if (typeOut.compareTo("l") == 0) output = input / 1000;
        }
        if (typeIn.compareTo("l") == 0) {
            if (typeOut.compareTo("fl oz") == 0) output = input * 33.81;
            if (typeOut.compareTo("gal") == 0) output = input / 3.79;
            if (typeOut.compareTo("ml") == 0) output = input * 1000;
            if (typeOut.compareTo("l") == 0) output = input;
        }
        return output;
    }
}