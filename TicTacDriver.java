/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TicTac;

/**
 *
 * @author jesse
 */
public class TicTacDriver {
    public static void main(String[] args) {
        // I have the board be periods becasue it helps me see where the board is when playing. 
        Board board = new Board(3);
        
        for (int i = 0; i < board.size; i++) {
            for (int j = 0; j < board.size; j++) {
                board.grid[i][j] = ".";
            }
        }
        
       
    
    
    Player player1 = new Player("Bob", "X");
    Player player2 = new Player("Mel","O");
    TicTacToe game = new TicTacToe(player1, player2, board, player1);
    game.startGame();
    
    
    
    
    }

}
