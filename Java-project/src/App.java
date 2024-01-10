// import java.util.Scanner;
// public class App {
//     public static void main(String[] args) throws Exception {
        

//         BankAccount account1 = new BankAccount(123456, 1000);
//         account1.deposit(500);
//         account1.withdraw(200);
//         account1.displayTransactionHistory();
//         System.out.println("Current balance: $" + account1.getBalance());
//         System.out.println("Account number: " + account1.getAccountNumber());

//     }
// }
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
     
        BankAccount userAccount = new BankAccount(123456, 1000);

        User user = new User("exampleUser", "examplePassword", userAccount);

        BankSingleton bankSingleton = BankSingletong.getInstance();
        
        bankSingleton.setUser(user);

        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Enter username: ");
            String enteredUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();

         
              User authenticateUser = bankSingleton.authenticateUser(enteredUsername, enteredPassword);

            if (authenticateUser!= null && bankSingleton.authenticateUser(enteredUsername,enteredPassword)) {
                System.out.println("Authentication successful!");

               
                userAccount.deposit(500);
                userAccount.withdraw(200);
                userAccount.displayTransactionHistory();

                System.out.println("Current balance: $" + userAccount.getBalance());
                System.out.println("Account number: " + userAccount.getAccountNumber());
            } else {
                System.out.println("Authentication failed. Invalid username or password.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
          
            scanner.close();
        }
    }
}