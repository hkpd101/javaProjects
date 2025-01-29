import java.util.Random;
import java.util.Scanner;

public class App {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws Exception {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        //NUMBER GUESSING GAME


        int guess;
        int attempts = 0;
        
        int randomNunber = random.nextInt(1,11);

        System.out.println("Welcome to the number guessing game!");
        System.out.println("I'm thinking of a number between 1 and 10");

        do{
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess < randomNunber){
                System.out.println("Too low, try again!");
            }else if(guess > randomNunber){
                System.out.println("Too high, try again!"); 
            }else{
                System.out.println("You guessed it! The number was " + randomNunber);
                System.out.println("It took you " + attempts + " attempts");
            }




        }while(guess != randomNunber);










        scanner.close();
    }
}
