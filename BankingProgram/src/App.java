import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {

        
                Scanner scanner = new Scanner(System.in);
            
            double balance =0;
            boolean isRunning = true;
            int choice;
            
            while (isRunning) {
                
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
                    case (1) -> ShowBalance(balance);
                    case (2) -> balance = Deposit(scanner,balance);
                    case (3) -> balance = Withdraw(scanner,balance);
                    case (4) -> isRunning = false;
                    
                    default -> System.out.println("Invalid Choice");
                }
                
                
                
            }
        }
        
    
    static void ShowBalance(double balance){
        System.out.println("******************************");

        System.out.printf("The current Balance is %.2f",balance);
    }



    static double Deposit(Scanner scanner ,double balance){
        double AddMoney = 0;
        System.out.println("*******************************");

        System.out.println("Please Enter the Amount");
        AddMoney = scanner.nextDouble();
        balance+=AddMoney;

        System.out.printf("The Deposited amount is %f",AddMoney);
        return balance;

        
    }


    static double Withdraw(Scanner scanner ,double balance){
        double SubMoney = 0;
        System.out.println("*******************************");

        System.out.println("Please Enter the Amount");
        SubMoney = scanner.nextDouble();
        balance -= SubMoney;

        System.out.printf("The Withdrawed amount is %f",SubMoney);
        return balance;
    }


}
