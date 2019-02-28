import java.util.Scanner;

public class AccountTester {
    public static void main(String[] args) {
        BankAccount[] accounts = {};

        Scanner in = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            System.out.print("D)eposit W)ithdraw M)onth end Q)uit: ");
            String input = in.next();
            if (input.equals("D") || input.equals("W")) { // Deposit or withdrawal
                System.out.print("Enter account number and amount: ");
                int num = in.nextInt();
                double amount = in.nextDouble();

                if (input.equals("D")) {
                    accounts[num].deposit(amount);
                }
                else {
                    accounts[num].withdraw(amount);
                }

                System.out.println("Balance: " + accounts[num].getBalance());
            }
            else if (input.equals("M")) { // Month end processing
                for (int n = 0; n < accounts.length; n++) {
                    accounts[n].monthEnd();
                    System.out.println(n + " " + accounts[n].getBalance());
                }
            }
            else if (input == "Q") {
                done = true;
            }
        }
    }
}