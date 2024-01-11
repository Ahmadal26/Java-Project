
import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;

    private String password;
    private List<BankAccount> accounts;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.accounts = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }

    public boolean isUserNameUnique(List<User> existingUsers, String newUserName) {
        for (User user : existingUsers) {
            if (user.getUserName().equals(newUserName)) {
                return false;
            }
        }
        return true;
    }

    public void createBankAccount() {
        int accountNumber = (int) (Math.random() * 1000000);

        BankAccount newAccount = new BankAccount(accountNumber, 0.0);

        accounts.add(newAccount);

        System.out.println("Bank account created successfully. Account number: " + accountNumber);
    }

    public void displayAccountDetails() {
        System.out.println("Username" + userName);
        System.out.println("Number of accounts: " + "1");// "accounts.size()"
        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: $" + account.getBalance());
        }
    }

    public void updateUsername(String newUsername) {
        this.userName = newUsername;
        System.out.println("Username is updated successfully");
    }

    public void updatedPassword(String newPassword) {

        this.password = newPassword;
        System.out.println("Password updated successfully");
    }
}

// if(isUserNameUnique(existingUsers, newUsername)){
// this.userName =newUsername;
// System.out.println("Username updated successfully.");

// }else{
// System.out.println("Username already exists. Please choose a different one.
// ");
// }