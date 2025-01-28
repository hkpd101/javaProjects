import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    
        // SHOPPING CART PROGRAM
        Scanner input = new Scanner(System.in);


        char item;
        int prize=0;
        int total = 0;
        int quantity;
        
        System.out.println("Welcome to the shopping cart program!");
        System.out.println("Please enter the item you want to buy and the quantity of the item.");
        System.out.println("Enter 'A' for Apple, 'B' for Banana, 'C' for Carrot, 'D' for Dragonfruit, 'E' for Eggplant, 'F' for Fig, 'G' for Grapes, 'H' for Honeydew, 'I' for Iceberg lettuce, 'J' for Jackfruit, 'K' for Kiwi, 'L' for Lemon, 'M' for Mango, 'N' for Nectarine, 'O' for Orange, 'P' for Papaya, 'Q' for Quince, 'R' for Raspberry, 'S' for Strawberry, 'T' for Tomato, 'U' for Ugli fruit, 'V' for Vanilla bean, 'W' for Watermelon, 'X' for Ximenia, 'Y' for Yam, 'Z' for Zucchini.");
        item = input.next().charAt(0);
        System.out.println("Enter the quantity of the item you want to buy.");
        quantity = input.nextInt();
       
        switch (item) {
            case 'A':
                prize = 1;
                break;
            case 'B':
                prize = 2;
                break;
            case 'C':
                prize = 3;
                break;
            case 'D':
                prize = 4;
                break;
            case 'E':
                prize = 5;
                break;
            case 'F':
                prize = 6;
                break;
            case 'G':
                prize = 7;
                break;
            case 'H':
                prize = 8;
                break;
            case 'I':
                prize = 9;
                break;
            case 'J':
                prize = 10;
                break;
            case 'K':
                prize = 11;
                break;
            case 'L':
                prize = 12;
                break;
            case 'M':
                prize = 13;
                break;
            case 'N':
                prize = 14;
                break;
            case 'O':
                prize = 15;
                break;
            case 'P':
                prize = 16;
                break;
            case 'Q':
                prize = 17;
                break;
            case 'R':
                prize = 18;
                break;
            case 'S':
                prize = 19;
                break;
            case 'T':
                prize = 20;
                break;
            case 'U':
                prize = 21;
                break;
            case 'V':
                prize = 22;
                break;
            case 'W':
                prize = 23;
                break;
            case 'X':
                prize = 24;
                break;
            case 'Y':
                prize = 25;
                break;
            case 'Z':
                prize = 26;
                break;
            default:
                System.out.println("Invalid item.");
                break;
        }
        prize = quantity * prize;
        total = total + prize;
        System.out.println("The total price of the items you want to buy is: " + total);
        System.out.println("Thank you for using the shopping cart program!");


        input.close();

    }
}
