import java.util.Random;
import java.util.Scanner;

public class PlayOnePlayerTwo extends RockPaperScissors interface Computerplay {
    public static void main(String[] args) {
    }
    public PlayOnePlayerTwo(){
        Random random = new Random();
        Scanner scanner = new Scanner();
    //Player one and two inputs and moves
            System.out.println("Player One, please enter your move rock, paper,scissors");
    playerOne = scanner.nextLine();

            if (!playerOne.equals("rock") && !playerOne.equals("paper") && !playerOne.equals("scissors"))  else {
        System.out.println("Player Two, please enter your move. rock, paper, scissors");
        playerTwo = scanner.nextLine();
    }
            if (!playerTwo.equals("rock") && !playerTwo.equals("paper") && !playerTwo.equals("scissors"))
            if (playerOne.equals(playerTwo))  else if ((playerOne.equals("rock") && playerTwo.equals("scissors")) ||
            (playerOne.equals("scissors") && playerTwo.equals("paper")) ||
            (playerOne.equals("paper") && playerTwo.equals("rock")))
} else {
        System.out.println("Invalid input please select 1 or 2");
        }

}

//Determine the winner
        if (playerMove.equals("rock")) {
                if (computerPlay.equals("scissors")) {
                System.out.println("Rock crushes scissors. You win!");
                } else {
                System.out.println("Paper covers rock. You lose!");
                }
                } else if (playerMove.equals("paper")) {
                if (computerPlay.equals("rock")) {
                System.out.println("Paper covers rock. You win!");
                } else {
                System.out.println("Scissors cut paper. You lose!");
                }
                } else if (playerMove.equals("scissors")) {
                if (computerPlay.equals("paper")) {
                System.out.println("Scissors cuts paper. You win!");
                } else {
                System.out.println("Rock crushes scissors. You lose!");
                }
                } else if (playerMove.equals(computerPlay)) {
                System.out.println("Its a tie!");

                } else {
                System.out.println("Invalid input. You lose!");
                }

                } else if (playerMove.equals("p")) {

