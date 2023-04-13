import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        //Getting input from the user
        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();

        //Get user's and computer play (0,1,2) for computer
        System.out.println("Select game. Press C to play computer. Press P to play another player.");
        String playerMove = scanner.nextLine().toUpperCase();
        String computerPlay = "";
        int computerInt;
        computerInt = generator.nextInt(3) + 1;
        String playerOne = "";
        String playerTwo = "";

        //Computer randomly play
        if (computerInt == 1) {
            computerPlay = "rock";
        } else if (computerInt == 2) {
            computerPlay = "paper";
        } else if (computerInt == 3) {
            computerPlay = "scissors";
        }
        System.out.println("Computer plays: " + computerPlay);


        if (playerMove == "c") {

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

            //Player one and two inputs and moves
            System.out.println("Player One, please enter your move rock, paper,scissors");
            playerOne = scanner.nextLine();

            if (!playerOne.equals("rock") && !playerOne.equals("paper") && !playerOne.equals("scissors")) {
                System.out.println("Invalid input, please enter valid move.");
            } else {
                System.out.println("Player Two, please enter your move. rock, paper, scissors");
                playerTwo = scanner.nextLine();
            }
            if (!playerTwo.equals("rock") && !playerTwo.equals("paper") && !playerTwo.equals("scissors")) {
                System.out.println("Invalid input, please enter valid move.");
            }
            if (playerOne.equals(playerTwo)) {
                System.out.println("You tied");
            } else if ((playerOne.equals("rock") && playerTwo.equals("scissors")) ||
                    (playerOne.equals("scissors") && playerTwo.equals("paper")) ||
                    (playerOne.equals("paper") && playerTwo.equals("rock"))) {
                System.out.println("Player One has won!");
            } else {
                System.out.println("Player two has won!");
            }
        } else {
            System.out.println("Invalid input please select 1 or 2");
        }

    }
        while(playAgain.equals("y"));

        //Play again prompt
        system.out.println("Would you like to play again? [y/n]");
        String playAgain = in.nextLine();
        if(playAgain.equals("n")) {
            system.out.println("Game stopped. Thanks for playing!");
    } if (!playAgain.equals("y") && !playAgain.equals("n")) {
            system.out.println("Invalid input, please enter valid response.");
    }

}