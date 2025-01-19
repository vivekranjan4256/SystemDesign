import Models.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;

    public void initializeGame(){
        //creating 2 players
        players = new LinkedList<>();
        PlayingPieceX xPiece = new PlayingPieceX();
        Player player1 = new Player("PlayerX",xPiece);

        PlayingPieceO oPiece = new PlayingPieceO();
        Player player2 = new Player("PlayerO", oPiece);

        players.add(player1);
        players.add(player2);

        //initializingBoard
        gameBoard = new Board(3);
    };
    public String startGame(){
        boolean noWinner = true;
        while(noWinner){
            Player playerTurn = players.removeFirst();

            gameBoard.printBoard();
            List<Pair<Integer,Integer>> freeSpaces = gameBoard.getFreeCells();
            if(freeSpaces.isEmpty()){
                noWinner = false;
                continue;
            }

            //reading the user input
            System.out.println("Player: "+ playerTurn.getName() + " Enter row, column:  ");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            //adding the piece
            boolean isPieceAddedSuccessfully = gameBoard.addPiece(inputRow, inputColumn, playerTurn.getPlayingPiece());
            if(!isPieceAddedSuccessfully){
                System.out.println("Incorrect position chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);
            boolean winner = isWinnerPresent(inputRow, inputColumn, playerTurn.getPlayingPiece().pieceType);
            if(winner){
                return playerTurn.getName();
            }
        }
        return "game tied";
    };

    public boolean isWinnerPresent(int row, int column, PieceType pieceType){
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch  = true;
        boolean antidiagonalmMatch = true;

        //row Match
        for(int i=0;i< gameBoard.size;i++){
            if(gameBoard.board[row][i]==null || gameBoard.board[row][i].pieceType!=pieceType) {
                rowMatch = false;
                break;
            }
        }
        //column Match
        for(int i=0;i< gameBoard.size;i++){
            if(gameBoard.board[i][column]==null || gameBoard.board[i][column].pieceType!=pieceType) {
                columnMatch = false;
                break;
            }
        }
        //diagonal Match
        for(int i=0;i< gameBoard.size;i++){
            if(gameBoard.board[i][i]==null || gameBoard.board[i][i].pieceType!=pieceType) {
                diagonalMatch = false;
                break;
            }
        }
        //anti diagonal Match
        for(int i=0;i< gameBoard.size;i++){
            if(gameBoard.board[gameBoard.size-i-1][gameBoard.size-i-1]==null || gameBoard.board[gameBoard.size-i-1][gameBoard.size-i-1].pieceType!=pieceType) {
                antidiagonalmMatch = false;
                break;
            }
        }
        return rowMatch || columnMatch || diagonalMatch || antidiagonalmMatch;
    }
}
