import java.util.Random;
import java.util.Scanner;


public class RockPaperScissors extends GameAbstract implements Game {
    private Scanner scanner;
    private Random generator;
    protected String playerOne;
    protected String playerTwo;
    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors();
        game.play();
    }
    public RockPaperScissors() {
        scanner = new Scanner(System.in);
        generator = new Random();
    }

    protected void initializeGame() {
        //Get user's and computer play (0,1,2) for computer
        System.out.println("Select game. Press C to play computer. Press P to play another player.");
        String playerMove = scanner.nextLine().toUpperCase();

        if (playerMove.equals("C")) {
            playerOne = "computer";
            playerTwo = "human";
        } else if (playerMove.equals("P")) {
            playerOne = "human1";
            playerTwo = "human2";
        } else {
            System.out.println("Invalid input.");
            System.exit(0);
        }
    }
    protected void determineWinner() {
        String playerOneMove = getPlayerMove(playerOne);
        String playerTwoMove = getPlayerMove(playerTwo);

        if (playerOneMove.equals(playerTwoMove)) {
            System.out.println("It's a tie!");
        } else if (playerOneMove.equals("rock") && playerTwoMove.equals("scissors")
                || playerOneMove.equals("paper") && playerTwoMove.equals("rock")
                || playerOneMove.equals("scissors") && playerTwoMove.equals("paper")) {
            System.out.println(playerOne + " wins!");
        } else {
            System.out.println(playerTwo + " wins!");
        }
    }

    public String getPlayerMove(String player) {
        String move = "";
        if (playerOne.equals("computer")) {
            int moveCode = generator.nextInt(3);
            if (moveCode == 0) {
                move = "rock";
            } else if (moveCode == 1) {
                move = "paper";
            } else {
                move = "scissors";
            }
            System.out.println(playerOne + " played " + move);
        } else {
            System.out.println(playerOne + ", please enter your move (rock, paper, or scissors):");
            move = scanner.nextLine().toLowerCase();
            while (!move.equals("rock") && !move.equals("paper") && !move.equals("scissors")) {
                System.out.println("Invalid input. Please enter rock, paper, or scissors:");
                move = scanner.nextLine().toLowerCase();
            }
        }
        return move;
    }


    public void play() {
        initializeGame();
        determineWinner();
    }
}
//public class RockPaperScissors extends GameAbstract implements Game {
//    public static void main(String[] args) {
//
//
//        Scanner scanner;
//        Random generator;
//
//
//        scanner = new Scanner(System.in);
//        generator = new Random();
//    }
//
//        @Override
//        protected void initializeGame () {
//            //Get user's and computer play (0,1,2) for computer
//            System.out.println("Select game. Press C to play computer. Press P to play another player.");
//            String playerMove = scanner.nextLine().toUpperCase();
//
//            if (playerMove.equals("C")) {
//                playerOne = "computer";
//                playerTwo = "human";
//            } else if (playerMove.equals("P")) {
//                playerOne = "human1";
//                playerTwo = "human2";
//            } else {
//                System.out.println("Invalid input.");
//                System.exit(0);
//            }
//        }
//
//        @Override
//        protected void determineWinner () {
//            String playerOneMove = getPlayerMove(playerOne);
//            String playerTwoMove = getPlayerMove(playerTwo);
//
//            if (playerOneMove.equals("rock")) {
//                if (playerTwoMove.equals("scissors")) {
//                    System.out.println("Rock crushes scissors. " + playerOne + " wins!");
//                } else if (playerTwoMove.equals("paper")) {
//                    System.out.println("Paper covers rock. " + playerTwo + " wins!");
//                } else {
//                    System.out.println("It's a tie!");
//                }
//            } else if (playerOneMove.equals("paper")) {
//                if (playerTwoMove.equals("rock")) {
//                    System.out.println("Paper covers rock. " + playerOne + " wins!");
//                } else if (playerTwoMove.equals("scissors")) {
//                    System.out.println("Scissors cut paper. " + playerTwo + " wins!");
//                } else {
//                    System.out.println("It's a tie!");
//                }
//            } else if (playerOneMove.equals("scissors")) {
//                if (playerTwoMove.equals("paper")) {
//                    System.out.println("Scissors cut paper. " + playerOne + " wins!");
//                } else if (playerTwoMove.equals("rock")) {
//                    System.out.println("Rock crushes scissors. " + playerTwo + " wins!");
//                } else {
//                    System.out.println("It's a tie!");
//                }
//            } else {
//                System.out.println("Invalid input.");
//            }
//        }
//
//        @Override
//        public String getPlayerMove (String player){
//            System.out.println(player + ", please enter your move (rock, paper, or scissors");
//            return player;
//        }
//
//    @Override
//    public String getPlayerMove() {
//        return null;
//    }
//}
