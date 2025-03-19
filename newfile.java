public class BankAccount {
    String accountHolder;
    String accountType;
    double currentBalance;

    public BankAccount(String accountHolder, String accountType, double currentBalance) {
        this.accountHolder = accountHolder;
        this.accountType = accountType;
        this.currentBalance = currentBalance;
    }

    public String toString() {
        return "Account Holder: " + accountHolder + "\n" +
               "Account Type: " + accountType + "\n" +
               "Current Balance: $" + currentBalance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", "Checking", 1150.0);
        System.out.println(account);
    }
}

