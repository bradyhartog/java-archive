/**
 * Makes conversions among various units of distance: oz, lb, g, kg
 */
public class Weight {
    /**
     * Creating input for starting unit, target unit, and starting value
     */
    private String typeIn;
    private String typeOut;
    private double input;

    /**
     * Constructs a converter for the units of weight
     * @param typeIn the starting unit
     * @param typeOut the target unit
     * @param input the starting value
     */
    public Weight(String typeIn, String typeOut, double input) {
        this.typeIn = typeIn;
        this.typeOut = typeOut;
        this.input = input;
    }

    /**
     * Converts among any of the units of weight
     * @return the converted value
     */
    public double getCnvsn() {
        double output = 0;
        if (typeIn.compareTo("oz") == 0) {
            if (typeOut.compareTo("oz") == 0) output = input;
            if (typeOut.compareTo("lb") == 0) output = input / 16;
            if (typeOut.compareTo("g") == 0) output = input * 28.35;
            if (typeOut.compareTo("kg") == 0) output = input / 35.27;
        }
        if (typeIn.compareTo("lb") == 0) {
            if (typeOut.compareTo("oz") == 0) output = input * 16;
            if (typeOut.compareTo("lb") == 0) output = input;
            if (typeOut.compareTo("g") == 0) output = input * 453.6;
            if (typeOut.compareTo("kg") == 0) output = input / 2.2;
        }
        if (typeIn.compareTo("g") == 0) {
            if (typeOut.compareTo("oz") == 0) output = input / 28.35;
            if (typeOut.compareTo("lb") == 0) output = input / 453.6;
            if (typeOut.compareTo("g") == 0) output = input;
            if (typeOut.compareTo("kg") == 0) output = input / 1000;
        }
        if (typeIn.compareTo("kg") == 0) {
            if (typeOut.compareTo("oz") == 0) output = input * 35.27;
            if (typeOut.compareTo("lb") == 0) output = input * 2.2;
            if (typeOut.compareTo("g") == 0) output = input * 1000;
            if (typeOut.compareTo("kg") == 0) output = input;
        }
        return output;
    }
}