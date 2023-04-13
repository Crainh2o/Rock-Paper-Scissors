import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        //Getting input from the user
        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();

        //Get user's and computer play (0,1,2) for computer
        System.out.println("Make a move! (rock/paper/scissors)");
        String playerMove = scanner.nextLine().toUpperCase();
        String computerPlay = "";
        int computerInt;
        computerInt = generator.nextInt(3) + 1;

        //Computer randomly play
        if (computerInt == 1) {
            computerPlay = "rock";
        } else if (computerInt == 2) {
            computerPlay = "paper";
        } else if (computerInt == 3) {
            computerPlay = "scissors";
        }
        System.out.println("Computer plays: " + computerPlay);

    }
}
