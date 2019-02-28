public class BankAccountFilter implements Filter {
    /**
     * Accepts or rejects a (@Link BankAccount)
     *
     * @param x the (@Link BankAccount) to be filtered
     * @return true if accepted
     */
    @Override
    public boolean accept(Object x) {
        if (x instanceof BankAccount) {
            return ((BankAccount) x).getBalance() < 1000;
        }
        return false;
    }
}