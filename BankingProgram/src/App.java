import java.util.Scanner;
import jdk.jshell.spi.ExecutionControl;



public class App {
    public static void main(String[] args) throws Exception {

        //JAVA BANKING PROGRAM FOR BEGINNERS

        Scanner scanner = new Scanner(System.in);
        
        //DECLARING VARIABLES

        double balance;
        boolean isRunning = true;
        int choice;

        System.out.println("*****************");
        System.out.println(" BANKING PROGRAM ");
        System.out.println("*****************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("*****************");

        System.out.println("Enter your choice(1-4): ");
        choice = scanner.nextInt();

        switch (choice) {
            case (1):
                    ShowBalance();
                
                break;
            case (2):
                    Deposit();
                
                break;
            case (3):
                    withdraw();
                
                break;
            case (4):
                    
                
                break; 

            default:
                System.out.println("Invalid Choice");
        }








        scanner.close();
        
    }
}
