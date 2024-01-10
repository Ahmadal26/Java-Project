
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

    public void createBankAccount(List<User> existingUsers) {
        if (isUserNameUnique(existingUsers, userName) && accounts.isEmpty()) {

            int accountNumber = (int) (Math.random() * 1000000);

            BankAccount newAccount = new BankAccount(accountNumber, 0.0);

            accounts.add(newAccount);

            System.out.println("Bank account created successfully. Account number: " + accountNumber);
        } else {
            System.out.println("Username is not unique or user already has a bank account.");
        }
    }
}