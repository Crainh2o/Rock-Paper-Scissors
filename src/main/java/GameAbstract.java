public abstract class GameAbstract {
protected String playerOne;
protected String playerTwo;

public void play() {
        initializeGame();
        determineWinner();
        }

protected abstract void initializeGame();

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

protected abstract String getPlayerMove(String player);
        }
//
//    protected abstract void initializeGame();
//    protected abstract void determineWinner();
//
//    public void play() {
//        initializeGame();
//        determineWinner();
//    }
//}
