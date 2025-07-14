import java.text.DecimalFormat;

public class Account {
    private String accountNumber;
    private double balance;

    private static final DecimalFormat df = new DecimalFormat("#,###.00");

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + df.format(amount));
        } else {
            System.out.println("The amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + df.format(amount));
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void transfer(Account destinationAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            withdraw(amount);
            destinationAccount.deposit(amount);
            System.out.println("Transferred: " + df.format(amount) + " to account: " + destinationAccount.getAccountNumber());
        } else {
            System.out.println("Transfer failed. Insufficient balance or invalid amount.");
        }
    }
}
