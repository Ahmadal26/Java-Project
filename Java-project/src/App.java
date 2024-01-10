public class App {
    public static void main(String[] args) throws Exception {

        BankAccount account1 = new BankAccount(123456, 1000);
        account1.deposit(500);
        account1.withdraw(100);
        account1.displayTransactionHistory();
        System.out.println("Current balance: $" + account1.getBalance());
        System.out.println("Account number: " + account1.getAccountNumber());

    }
}
