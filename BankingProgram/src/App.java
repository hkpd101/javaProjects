import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {

        //JAVA BANKING PROGRAM FOR BEGINNERS

        Scanner scanner = new Scanner(System.in);
        
        //DECLARING VARIABLES

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
            case (2) -> Deposit();
            case (3) -> Withdraw(balance);
            case (4) -> isRunning = false;

            default -> System.out.println("Invalid Choice");
        }



        }

        scanner.close();
        
    }
    static void ShowBalance(double balance){
        System.out.println("******************************");

        System.out.printf("The current Balance is %.2f",balance);
    }



    static void Deposit(){

        Scanner scan = new Scanner(System.in);
        double AddMoney = 0;
        System.out.println("*******************************");

        System.out.println("Please Enter the Amount");
        AddMoney = scan.nextDouble();

        System.out.printf("The Deposited amount is %f",AddMoney);

        scan.close();
    }

    
    static void Withdraw(double balance){

        Scanner scan = new Scanner(System.in);
        double SubMoney = 0;
        System.out.println("*******************************");

        System.out.println("Please Enter the Amount");
        SubMoney = scan.nextDouble();
        balance = balance - SubMoney;

        System.out.printf("The Withdrawed amount is %f",SubMoney);

        scan.close();
    }


}
