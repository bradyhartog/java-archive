public class FloatingPoint {
    /**
     * Determines the mathematical qualities of a floating point number
     */
    private double number;

    public FloatingPoint(double number) {
        this.number = number;
    }

    /**
     * Tests the size of the floating point number
     *
     * @return small if < 1, large if > 1000000
     */
    public String getSize() {
        String size = "";
        if (Math.abs(number) < 1) {
            size = "small";
        } else if (Math.abs(number) > 1000000) {
            size = "large";
        }
        return size;
    }

    /**
     * Tests the size of the floating point number
     *
     * @return positive if < 0, negative if < 0, otherwise zero
     */
    public String getSign() {
        String sign;
        if (number > 0) {
            sign = "positive";
        } else if (number < 0) {
            sign = "negative";
        } else {
            sign = "zero";
        }
        return sign;
    }
}