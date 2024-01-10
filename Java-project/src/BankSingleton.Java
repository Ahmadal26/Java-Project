public class BankSingleton {

    private static BankSingleton instance;
    private User user;

    private BankSingleton() {
       
    }

    public static BankSingleton getInstance() {
        if (instance == null) {
            instance = new BankSingleton();
        }
        return instance;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public User getUser(User user){
        return user;
    }

    public boolean authenticateUser(String enteredUsername, String enteredPassword) {
        
        return user != null && user.getUserName().equals(enteredUsername) && user.getPassword().equals(enteredPassword);
    }

   
}
