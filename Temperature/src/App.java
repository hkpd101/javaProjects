import  java.util.Scanner;
public class App {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);


        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.println("Enter the unit (C/F): ");
        unit = scanner.next().toUpperCase();
        newTemp = (unit.equals("C")) ?  (temp - 32) * 5/9 : (temp - 5/9) + 32;
        System.out.printf("The temperature in %s is %f",unit, newTemp);














        scanner.close();

    }
}
