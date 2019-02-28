/**
 * Provides an integer formatted for a given base
 */
public class BaseFormatter implements NumberFormatter {
    private int base;

    /**
     * Constructs a BaseFormatter with a given base
     * @param base
     */
    public BaseFormatter(int base) {
        this.base = 10;
        if (base >= 2 && base <= 36) {
            this.base = base;
        }
    }

    /**
     * Returns a base formatted string
     * @param n the integer to format
     * @return a base formatted string
     */
    @Override
    public String format(int n) {
        return Integer.toString(n, base);
    }
}