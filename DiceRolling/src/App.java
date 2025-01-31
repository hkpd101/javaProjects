
import java.util.Random;
import java.util.Scanner;

public class App {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws Exception {

        //JAVA DICE ROLLING PROGRAM

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numofDice;
        int total=0;

            
        /*
         * Get # of dice from the user
         * CHECK OF # OF DICE >0
         * ROLL ALL THE DICE
         * GET THE TOTAL 
         * DISPLAY ASCII OF DICE

         */
        
         System.out.println("Enter the number of dice to roll : ");
         numofDice = scanner.nextInt();

         if(numofDice >0 ){
            for(int i =0;i<numofDice;i++){
                int roll = random.nextInt(1,7);
                printDice(roll);
                System.out.printf("You rolled : %d \n",roll);
                total +=roll;
            }
            System.out.printf("TOTAL: %d \n",total);


         }
         else{
            System.out.println("The number of dice rolled  must be GREATER THAN 0.");
         }

    scanner.close();
    }

    static void printDice(int roll){
        String[] diceFaces = {
            """
            -------
            |     |
            |  •  |
            |     |
            -------
            """,
            """
            -------
            | •   |
            |     |
            |   • |
            -------
            """,
            """
            -------
            | •   |
            |  •  |
            |   • |
            -------
            """,
            """
            -------
            | • • |
            |     |
            | • • |
            -------
            """,
            """
            -------
            | • • |
            |  •  |
            | • • |
            -------
            """,
            """
            -------
            | • • |
            | • • |
            | • • |
            -------
            """
        };
        System.out.println(diceFaces[roll-1]);
    }
}



    
       

            

