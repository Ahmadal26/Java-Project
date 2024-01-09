public class User {

    private String userName;
    private String password;
    private String account;

    public User(String userName, String password, String account) {
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

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

}
// not done (instance)