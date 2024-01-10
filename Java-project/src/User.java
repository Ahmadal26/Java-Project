public class User {

    private String userName;
    private String password;
    private BankAccount account;

    public User(String userName, String password, BankAccount account) {
        this.userName = userName;
        this.password = password;
        this.account = account;
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

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;


       
    
    }

}
