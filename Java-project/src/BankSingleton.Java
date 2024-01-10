public class BankSingleton {
    
    
 private static BankSingleton instance;
private BankSingleton() {

        

    }
    public static BankSystem getInstance() {

        if (instance == null) {
            instance = new BankSystem();

        }
        return instance;

    }



    // Scanner myScanner =new Scanner(System.in); 
    

//     public String validation(String userName, int password){

// if (userName)



//     }

}
// not Done 
