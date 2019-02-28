public class CheckingAccount extends BankAccount {
    private int withdrawals;
    private int deposits;
    final int FREE_TRANSACTIONS = 3;
    final int TRANSACTION_FEE = 1;

    /**
     * Constructs a checking account with a zero balance.
     */
    public CheckingAccount() {}

    // Overriding superclass methods
    public void deposit(double amount) {
        super.deposit(transact("deposit", deposits, amount));
        deposits++;
    }

    public void withdraw(double amount) {
        super.withdraw(transact("withdrawal", withdrawals, amount));
        withdrawals++;
    }

    public double transact(String type, int transactionType, double amount) {
        double amountPlusFees = 0;
        if (transactionType > FREE_TRANSACTIONS) {
            if (type.equals("deposit")) {
                amountPlusFees = amount - TRANSACTION_FEE;
            }
            else if (type.equals("withdrawal")) {
                amountPlusFees = amount + TRANSACTION_FEE;
            }
        }
        return amountPlusFees;
    }

    public void monthEnd() {
        withdrawals = 0;
    }
}