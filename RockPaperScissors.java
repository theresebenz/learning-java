
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int computerChoice = rand.nextInt(3);
        System.out.print("Enter 0, 1, 2: ");
        int playerChoice = input.nextInt();
        System.out.println(computerChoice);

        //00 rock
        //11 paper
        //22 scissors
        if (playerChoice == computerChoice) {
            System.out.println("its a draw");

        } else if(playerChoice == 0 && computerChoice == 1) {
            System.out.println("computer wins");

        } else if(playerChoice == 0 && computerChoice == 2) {
           System.out.println("player wins"); 

        } else if(playerChoice == 1 && computerChoice == 0) {
            System.out.println("player wins");

        } else if(playerChoice == 1 && computerChoice == 2) {
            System.out.println("computer wins");

        } else if(playerChoice == 2 && computerChoice == 0) {
            System.out.println("computer wins");

        } else if(playerChoice == 2 && computerChoice == 1) {
            System.out.println("player wins");
        } else {
            System.out.println("Not an option");
      
        }

        
    
    }
}
