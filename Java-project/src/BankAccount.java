public class BankAccount {

    private int accountNumber;
    private double balance;
    private double[] transactionHistory;

    public BankAccount(int accountNumber, double balance, double[] transactionHistory) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionHistory = transactionHistory;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double[] getTransactionHistory() {
        return transactionHistory;
    }

    public void setTransactionHistory(double[] transactionHistory) {
        this.transactionHistory = transactionHistory;
    }

}
