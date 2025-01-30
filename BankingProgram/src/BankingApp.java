import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void showBalance() {
        System.out.println("\n******************************");
        System.out.printf("Current Balance: $%.2f%n", balance);
        System.out.println("******************************");
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
            return;
        }
        balance += amount;
        System.out.printf("Successfully deposited: $%.2f%n", amount);
        showBalance();
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance! Transaction failed.");
            return;
        }
        balance -= amount;
        System.out.printf("Successfully withdrawn: $%.2f%n", amount);
        showBalance();
    }
}

public class BankingApp {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();
        boolean isRunning = true;

        while (isRunning) {
            printMenu();
            System.out.print("Enter your choice (1-4): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 4.");
                scanner.next(); // Consume invalid input
                continue;
            }

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> account.showBalance();
                case 2 -> {
                    System.out.print("Enter deposit amount: $");
                    if (scanner.hasNextDouble()) {
                        account.deposit(scanner.nextDouble());
                    } else {
                        System.out.println("Invalid amount. Please enter a valid number.");
                        scanner.next();
                    }
                }
                case 3 -> {
                    System.out.print("Enter withdrawal amount: $");
                    if (scanner.hasNextDouble()) {
                        account.withdraw(scanner.nextDouble());
                    } else {
                        System.out.println("Invalid amount. Please enter a valid number.");
                        scanner.next();
                    }
                }
                case 4 -> {
                    System.out.println("Thank you for using our banking system. Goodbye!");
                    isRunning = false;
                }
                default -> System.out.println("Invalid choice. Please select between 1 and 4.");
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n*****************");
        System.out.println("   BANKING APP   ");
        System.out.println("*****************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("*****************");
    }
}
