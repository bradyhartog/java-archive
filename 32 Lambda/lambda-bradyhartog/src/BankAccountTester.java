public class BankAccountTester {
    public static void main(String[] args) {
        concreteImplementation();
        lambdaImplementation();
    }

    private static void lambdaImplementation() {
        BankAccount[] accounts = getBankAccounts();
        BankAccountMeasurer measurer = new BankAccountMeasurer();

        Filter filter = (Object obj) -> ((BankAccount)obj).getBalance() < 1000;

        double average = Data.average(accounts, measurer, filter);
        printOutcome(average);
    }

    private static void concreteImplementation() {
        BankAccount[] accounts = getBankAccounts();

        BankAccountMeasurer measurer = new BankAccountMeasurer();
        BankAccountFilter filter = new BankAccountFilter();

        double average = Data.average(accounts, measurer, filter);
        printOutcome(average);
    }

    private static void printOutcome(double average) {
        System.out.println("Average balance of accounts less than 1000: " + average);
        System.out.println("Expected: 625");
    }

    private static BankAccount[] getBankAccounts() {
        BankAccount[] accounts = new BankAccount[5];

        accounts[0] = new BankAccount(500);
        accounts[1] = new BankAccount(750);
        accounts[2] = new BankAccount(1000);
        accounts[3] = new BankAccount(1250);
        accounts[4] = new BankAccount(1500);
        return accounts;
    }
}