
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        BankAccount userAccount = new BankAccount(123456, 1000);

        User user = new User("Ahmad", "123");

        BankSingleton bankSingleton = BankSingleton.getInstance();

        bankSingleton.setUser(user);

        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {
                System.out.print("Enter username: ");
                String enteredUsername = scanner.nextLine();

                System.out.print("Enter password: ");
                String enteredPassword = scanner.nextLine();

                if (bankSingleton.authenticateUser(enteredUsername, enteredPassword)) {
                    System.out.println("Authentication successful!");

                } else {
                    System.out.println("Authentication failed. Invalid username or password.");
                }
                System.out.println("Welcome: " + user.getUserName());
                System.out.println("choose an option:");
                System.out.println("0 - Display account details");
                System.out.println("1 - Update username");
                System.out.println("2 - Update password");
                System.out.println("3 - sign out and exit");

                int userAction = scanner.nextInt();
                scanner.nextLine();

                switch (userAction) {
                    case 0:
                        user.displayAccountDetails();

                        user.createBankAccount();

                        userAccount.deposit(500);

                        userAccount.withdraw(200);
                        userAccount.displayTransactionHistory();

                        System.out.println("Current balance: $" + userAccount.getBalance());
                        System.out.println("Account number: " + userAccount.getAccountNumber());
                        return;
                    case 1:
                        System.out.println("Enter new username: ");
                        String newUsername = scanner.nextLine();
                        user.updateUsername(newUsername);
                        break;
                    case 2:
                        System.out.println("Enter new password: ");
                        String newPassword = scanner.nextLine();
                        user.updatedPassword(newPassword);
                        break;
                    case 3:
                        System.out.println("Signing out. Goodbye! ");
                        return;
                    default:
                        System.out.println("Invaild choice. Please enter a vaild option,");
                        break;
                }
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {

            scanner.close();
        }
    }
}
