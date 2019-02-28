/**
 * Returns an integer formatted with decimal separators (commas)
 */
public class DecimalSeparatorFormatter implements NumberFormatter {
    /**
     * Formats an integer using commas to separate the values
     * @param n the integer to format
     * @return a decimal separated string
     */
    @Override
    public String format(int n) {
        return String.format("%,d", n);
    }
}