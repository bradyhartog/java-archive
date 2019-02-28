/**
 * A class for generating factors of integers. Returns PRIME if prime.
 */

public class FactorGenerator {
    int integer = 0;

    /**
     * Constructs a FactorGenerator object.
     * @param integer the integer to factor
     */
    public FactorGenerator(int integer) {
        this.integer = integer;
    }

    /**
     * Generates the factors of the integer.
     * @return the list of factors
     */
    public String getFactors() {
        String factors = "";

        while (integer != 1) {
            for (int i = 2; i <= integer; i++) {
                if (integer % i == 0) {
                    factors = factors + i + ", ";
                    integer = integer / i;
                    break;
                }
            }
        }
        factors = factors.substring(0, factors.length() - 1);
        factors = factors.substring(0, factors.length() - 1);
        if (factors.indexOf(",") == -1) {
            factors = "PRIME";
        }
        return factors;
    }
}