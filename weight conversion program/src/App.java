import java.util.Scanner;

public class App {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        //WEIGHT CONVERSION PROGRAM


        double weight;
        double newWeight;
        int choice;

        System.out.println(("Weight Conversion Program"));
        System.out.println("1. Convert Kilograms to Pounds");
        System.out.println("2. Convert Pounds to Kilograms");
        System.out.println("3. Exit");
        System.out.println("Enter your choice: ");
        choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Enter weight in Kilograms: ");
                weight = scanner.nextDouble();
                newWeight = weight * 2.20462;
                System.out.println("Weight in Pounds: " + newWeight);
            }
            case 2 -> {
                System.out.println("Enter weight in Pounds: ");
                weight = scanner.nextDouble();
                newWeight = weight / 2.20462;
                System.out.println("Weight in Kilograms: " + newWeight);
            }
            case 3 -> System.out.println("Exiting Program");
            default -> System.out.println("Invalid Choice");
        }


        scanner.close();
    }
}
