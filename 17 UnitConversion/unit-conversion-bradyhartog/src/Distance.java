/**
 * Makes conversions among various units of distance: in, ft, mi, cm, m, km
 */
public class Distance {
    /**
     * Creating input for starting unit, target unit, and starting value
     */
    private String typeIn;
    private String typeOut;
    private double input;

    /**
     * Constructs a converter for the units of distance
     * @param typeIn the starting unit
     * @param typeOut the target unit
     * @param input the starting value
     */
    public Distance(String typeIn, String typeOut, double input) {
        this.typeIn = typeIn;
        this.typeOut = typeOut;
        this.input = input;
    }

    /**
     * Converts among any of the units of distance
     * @return the converted value
     */
    public double getCnvsn() {
        double output = 0;
        if (typeIn.compareTo("in") == 0) {
            if (typeOut.compareTo("in") == 0) output = input;
            if (typeOut.compareTo("ft") == 0) output = input / 12;
            if (typeOut.compareTo("mi") == 0) output = input / 63360;
            if (typeOut.compareTo("cm") == 0) output = input * 2.54;
            if (typeOut.compareTo("m") == 0) output = input * 0.0254;
            if (typeOut.compareTo("km") == 0) output = input * 0.0000254;
        }
        if (typeIn.compareTo("ft") == 0) {
            if (typeOut.compareTo("in") == 0) output = input * 12;
            if (typeOut.compareTo("ft") == 0) output = input;
            if (typeOut.compareTo("mi") == 0) output = input / 5280;
            if (typeOut.compareTo("cm") == 0) output = input * 30.48;
            if (typeOut.compareTo("m") == 0) output = input * 0.3048;
            if (typeOut.compareTo("km") == 0) output = input * 0.0003048;
        }
        if (typeIn.compareTo("mi") == 0) {
            if (typeOut.compareTo("in") == 0) output = input * 63360;
            if (typeOut.compareTo("ft") == 0) output = input * 5280;
            if (typeOut.compareTo("mi") == 0) output = input;
            if (typeOut.compareTo("cm") == 0) output = input * 160934;
            if (typeOut.compareTo("m") == 0) output = input * 1609.34;
            if (typeOut.compareTo("km") == 0) output = input * 1.60934;
        }
        if (typeIn.compareTo("cm") == 0) {
            if (typeOut.compareTo("in") == 0) output = input / 2.54;
            if (typeOut.compareTo("ft") == 0) output = input / 30.48;
            if (typeOut.compareTo("mi") == 0) output = input / 160934;
            if (typeOut.compareTo("cm") == 0) output = input;
            if (typeOut.compareTo("m") == 0) output = input / 100;
            if (typeOut.compareTo("km") == 0) output = input / 100000;
        }
        if (typeIn.compareTo("m") == 0) {
            if (typeOut.compareTo("in") == 0) output = input * 39.37;
            if (typeOut.compareTo("ft") == 0) output = input * 3.28;
            if (typeOut.compareTo("mi") == 0) output = input * 1609.34;
            if (typeOut.compareTo("cm") == 0) output = input * 100;
            if (typeOut.compareTo("m") == 0) output = input;
            if (typeOut.compareTo("km") == 0) output = input / 1000;
        }
        if (typeIn.compareTo("km") == 0) {
            if (typeOut.compareTo("in") == 0) output = input * 39370.1;
            if (typeOut.compareTo("ft") == 0) output = input * 3280.84;
            if (typeOut.compareTo("mi") == 0) output = input / 1.60934;
            if (typeOut.compareTo("cm") == 0) output = input / 100000;
            if (typeOut.compareTo("m") == 0) output = input / 1000;
            if (typeOut.compareTo("km") == 0) output = input;
        }
        return output;
    }
}