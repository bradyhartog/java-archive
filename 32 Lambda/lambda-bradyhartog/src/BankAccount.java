/**
 * Represents a BankAccount object
 */
public class BankAccount {
    private double balance;

    /**
     * Creates an instance of a bank account
     * @param balance the starting balance
     */
    public BankAccount(double balance) {
        this.balance = balance;
    }

    /**
     * Adds an amount to the balance
     * @param amount the amount to add
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Returns the current balance
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }
}