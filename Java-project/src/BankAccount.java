import java.util.ArrayList;
import java.util.List;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private List<Transaction> transactionHistory;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            Transaction depositTransaction = new Transaction("Deposit", "Deposit", amount);
            transactionHistory.add(depositTransaction);
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            Transaction withdrawalTransaction = new Transaction("Withdrawal", "Withdrawal", amount);
            transactionHistory.add(withdrawalTransaction);
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    public void displayTransactionHistory() {
        System.out.println("Transaction History:");
        for (Transaction transaction : transactionHistory) {
            System.out.println("Date: " + transaction.getDate() +
                    ", Type: " + transaction.getType() +
                    ", Amount: $" + transaction.getAmount());
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

}