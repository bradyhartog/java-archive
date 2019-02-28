/**
 * Provides default formatting of integers
 */
public class DefaultFormatter implements NumberFormatter {
    /**
     * Returns an integer in default formatting
     * @param n the integer to format
     * @return a default formatted string
     */
    @Override
    public String format(int n) {
        return String.format("%d", n);
    }
}