public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.initializeGame();
        System.out.println("Winner of the game is: " + ticTacToeGame.startGame());
    }
}
