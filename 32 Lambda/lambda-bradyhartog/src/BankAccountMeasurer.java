public class BankAccountMeasurer implements Measure {
    /**
     * Computes the measurement of the bank account
     *
     * @param obj the bank account to measure
     * @return the balance
     */
    @Override
    public double measure(Object obj) {
        if(obj instanceof BankAccount) {
            return ((BankAccount)obj).getBalance();
        }
        return 0;
    }
}