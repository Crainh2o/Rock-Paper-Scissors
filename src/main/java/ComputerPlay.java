import java.util.Random;
import java.util.Scanner;

public interface ComputerPlay {

    default String generateComputerMove() {
        Random random = new Random();
        int computerInt = random.nextInt(3) + 1;
        String computerPlay = "";

        if (computerInt == 1) {
            computerPlay = "rock";
        } else if (computerInt == 2) {
            computerPlay = "paper";
        } else if (computerInt == 3) {
            computerPlay = "scissors";
        }

        System.out.println("Computer plays: " + computerPlay);
        return computerPlay;
    }

    default boolean playAgain(Scanner in) {
        System.out.println("Would you like to play again? [y/n]");
        String playAgain = in.nextLine();

        if (playAgain.equals("n")) {
            System.out.println("GameAbstract stopped. Thanks for playing!");
            return false;
        }

        if (!playAgain.equals("y")) {
            System.out.println("Invalid input, please enter valid response.");
            return playAgain(in);
        }

        return true;
    }
}

//    public static void main(String[] args) {
//            boolean tie = true;
//            do{
//                String computer = Computerplay();
//                String user = PlayerMove();
//                tie = (computer.compareTo(user) == 0);
//                determineWinner(computer, user);
//            }while(tie);
//        }
//        public Computerplay(){
//            Random random = new Random();
//            Scanner scanner = new Scanner();
//
//            if (computerInt == 1) {
//                computerPlay = "rock";
//            } else if (computerInt == 2) {
//                computerPlay = "paper";
//            } else if (computerInt == 3) {
//                computerPlay = "scissors";
//            }
//            System.out.println("Computer plays: " + computerPlay);
//        }
//        public static boolean playAgain()
//        {
//            //Play again prompt
//            system.out.println("Would you like to play again? [y/n]");
//            String playAgain = in.nextLine();
//            if(playAgain.equals("n")) {
//                system.out.println("GameAbstract stopped. Thanks for playing!");
//            } if (!playAgain.equals("y") && !playAgain.equals("n")) {
//            system.out.println("Invalid input, please enter valid response.");
//        }
//
//        }
//    }
////Determine the winner
//        if (playerMove.equals("rock")) {
//        if (computerPlay.equals("scissors")) {
//            System.out.println("Rock crushes scissors. You win!");
//        } else {
//            System.out.println("Paper covers rock. You lose!");
//        }
//    } else if (playerMove.equals("paper")) {
//        if (computerPlay.equals("rock")) {
//            System.out.println("Paper covers rock. You win!");
//        } else {
//            System.out.println("Scissors cut paper. You lose!");
//        }
//    } else if (playerMove.equals("scissors")) {
//        if (computerPlay.equals("paper")) {
//            System.out.println("Scissors cuts paper. You win!");
//        } else {
//            System.out.println("Rock crushes scissors. You lose!");
//        }
//    } else if (playerMove.equals(computerPlay)) {
//        System.out.println("Its a tie!");
//
//    } else {
//        System.out.println("Invalid input. You lose!");
//    }
//
//} else if (playerMove.equals("p")) {
//
//
//        }
