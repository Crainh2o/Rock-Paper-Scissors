import java.util.Random;
import java.util.Scanner;

public class PlayerMove {
    public static void main(String[] args) {

    }
    public PlayerMove(){
        Random random = new Random();
        Scanner scanner = new Scanner();
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


}
