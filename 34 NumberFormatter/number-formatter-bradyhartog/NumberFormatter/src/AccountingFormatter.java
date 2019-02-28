/**
 * Formats an integer for accounting purposes
 */
public class AccountingFormatter implements NumberFormatter {
    /**
     * Returns an accounting formatted string
     * @param n the integer to format
     * @return an accounting formatted string
     */
    @Override
    public String format(int n) {
        return String.format("%(d", n);
    }
}