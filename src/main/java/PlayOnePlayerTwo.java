
import java.util.Random;
import java.util.Scanner;

public class PlayOnePlayerTwo extends RockPaperScissors implements ComputerPlay {

    private Scanner scanner;

    public PlayOnePlayerTwo() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void play() {
        // Get user's and computer play (0,1,2) for computer
        System.out.println("Select game. Press C to play computer. Press P to play another player.");
        String playerMove = scanner.nextLine().toUpperCase();

        if (playerMove.equals("C")) {
            playerOne = "human";
            playerTwo = "computer";
        } else if (playerMove.equals("P")) {
            playerOne = "human1";
            playerTwo = "human2";
        } else {
            System.out.println("Invalid input.");
            System.exit(0);
        }

        // Game one and two inputs and moves
        String playerOneMove = getPlayerMove(playerOne);
        String playerTwoMove = getPlayerMove(playerTwo);

        // Determine the winner
        if (playerOneMove.equals(playerTwoMove)) {
            System.out.println("It's a tie!");
        } else if ((playerOneMove.equals("rock") && playerTwoMove.equals("scissors")) ||
                (playerOneMove.equals("scissors") && playerTwoMove.equals("paper")) ||
                (playerOneMove.equals("paper") && playerTwoMove.equals("rock"))) {
            System.out.println(playerOne + " wins!");
        } else {
            System.out.println(playerTwo + " wins!");
        }
    }

    @Override
    public String getPlayerMove(String player) {
        System.out.println(player + ", please enter your move (rock, paper, or scissors)");
        String move = scanner.nextLine();
        while (!move.equals("rock") && !move.equals("paper") && !move.equals("scissors")) {
            System.out.println("Invalid move, please try again.");
            System.out.println(player + ", please enter your move (rock, paper, or scissors)");
            move = scanner.nextLine();
        }
        return move;
    }

    @Override
    public String generateComputerMove() {
        Random random = new Random();
        int computerInt = random.nextInt(3) + 1;
        String computerMove = "";
        if (computerInt == 1) {
            computerMove = "rock";
        } else if (computerInt == 2) {
            computerMove = "paper";
        } else if (computerInt == 3) {
            computerMove = "scissors";
        }
        return computerMove;
    }
}
//
//public class PlayOnePlayerTwo extends RockPaperScissors implements Computerplay {
//    public static void main(String[] args) {
//    }
//    public PlayOnePlayerTwo(){
//        Random random = new Random();
//        Scanner scanner = new Scanner();
//    //Game one and two inputs and moves
//            System.out.println("Game One, please enter your move rock, paper,scissors");
//    playerOne = scanner.nextLine();
//
//            if (!playerOne.equals("rock") && !playerOne.equals("paper") && !playerOne.equals("scissors"))  else {
//        System.out.println("Game Two, please enter your move. rock, paper, scissors");
//        playerTwo = scanner.nextLine();
//    }
//            if (!playerTwo.equals("rock") && !playerTwo.equals("paper") && !playerTwo.equals("scissors"))
//            if (playerOne.equals(playerTwo))  else if ((playerOne.equals("rock") && playerTwo.equals("scissors")) ||
//            (playerOne.equals("scissors") && playerTwo.equals("paper")) ||
//            (playerOne.equals("paper") && playerTwo.equals("rock")))
//} else {
//        System.out.println("Invalid input please select 1 or 2");
//        }
//
//}
//
////Determine the winner
//        if (playerMove.equals("rock")) {
//                if (computerPlay.equals("scissors")) {
//                System.out.println("Rock crushes scissors. You win!");
//                } else {
//                System.out.println("Paper covers rock. You lose!");
//                }
//                } else if (playerMove.equals("paper")) {
//                if (computerPlay.equals("rock")) {
//                System.out.println("Paper covers rock. You win!");
//                } else {
//                System.out.println("Scissors cut paper. You lose!");
//                }
//                } else if (playerMove.equals("scissors")) {
//                if (computerPlay.equals("paper")) {
//                System.out.println("Scissors cuts paper. You win!");
//                } else {
//                System.out.println("Rock crushes scissors. You lose!");
//                }
//                } else if (playerMove.equals(computerPlay)) {
//                System.out.println("Its a tie!");
//
//                } else {
//                System.out.println("Invalid input. You lose!");
//                }
//
//                } else if (playerMove.equals("p")) {

