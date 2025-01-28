import java.util.Scanner;
public class App {
    public static void main(String[] args){


        // MAD LIBS GAME

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String adjective2;
        String adjective3;
        String noun1;
        String noun2;
        String noun3;

        System.out.println("Enter an adjective1: ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter an noun1: ");
        noun1 = scanner.nextLine();
        System.out.println("Enter an adjective2: ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter an noun2: ");
        noun2 = scanner.nextLine();
        System.out.println("Enter an adjective3: ");
        adjective3 = scanner.nextLine(); 
        System.out.println("Enter an noun3: ");
        noun3 = scanner.nextLine();


        System.out.println("Today I went to a " + adjective1 + " restaurant. The food was " + adjective2 + " and the service was " + adjective3 + 
        ". I ordered a" + noun1 + " and my friend ordered a " + noun2 + ". We also got a "  + noun3 + " to share. It was a great meal!");


        scanner.close();


    }
}
