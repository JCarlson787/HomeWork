/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TicTac;
import java.util.Scanner;
/**
 *
 * @author jesse
 */
public class TicTacToe {
    Player player1;
    Player player2;
    Board board;
    Player currentPlayer;
    int count = 2; 

    public TicTacToe(Player player1, Player player2, Board board, Player currentPlayer) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
        this.currentPlayer = currentPlayer;
    }

    
    

    public void switchPlayer() {
        count++;
        if(count % 2 == 0) {
            currentPlayer = player1;
        } else {
            currentPlayer = player2;
        }
    }

    public void makeMove(int num) {
        
        int row;
        int col;
        switch (num) {
            case 7:
                row = 0;
                col = 0;
                if (board.grid[row][col].equals(".")) {
                    board.grid[row][col] = currentPlayer.getSymbol();
                }
                break;
            case 8:
                row = 0;
                col = 1;
                if (board.grid[row][col].equals(".")) {
                    board.grid[row][col] = currentPlayer.getSymbol();
                }
                break;
            case 9:
                row = 0;
                col = 2;
                if (board.grid[row][col].equals(".")) {
                    board.grid[row][col] = currentPlayer.getSymbol();
                }
                break;
            case 4:
                row = 1;
                col = 0;
                if (board.grid[row][col].equals(".")) {
                    board.grid[row][col] = currentPlayer.getSymbol();
                }
                break;
            case 5:
                row = 1;
                col = 1;
                if (board.grid[row][col].equals(".")) {
                    board.grid[row][col] = currentPlayer.getSymbol();
                }
                break;
            case 6:
                row = 1;
                col = 2;
                if (board.grid[row][col].equals(".")) {
                    board.grid[row][col] = currentPlayer.getSymbol();
                }
                break;
            case 1:
                row = 2;
                col = 0;
                if (board.grid[row][col].equals(".")) {
                    board.grid[row][col] = currentPlayer.getSymbol();
                }
                break;
            case 2:
                row = 2;
                col = 1;
                if (board.grid[row][col].equals(".")) {
                    board.grid[row][col] = currentPlayer.getSymbol();
                }
                break;
            case 3:
                row = 2;
                col = 2;
                if (board.grid[row][col].equals(".")) {
                    board.grid[row][col] = currentPlayer.getSymbol();
                }
                break;
            default:
                break;
        }
    }




    public void startGame() {
        Scanner input = new Scanner(System.in);
        boolean win;
        boolean playing = true;
        boolean notFull = board.isFull();
        System.out.println("For this game pretend that your number pad is a tictactoe board. (7 = top left, 3 = bottom right):);");
        while (playing) {
            while (notFull) {
                System.out.println("It is " + currentPlayer.getName() + "'s turn.");
                System.out.print("Please input the number that coresponds with your move: ");
                int num = input.nextInt();
                if (num > 9 || num < 1) {
                    System.out.println("That is an invalid number! Please try again.");
                    continue;
                    }
                makeMove(num);
                notFull = board.isFull();
                board.display();
                win = board.checkWinner("X");
                if (win) {
                    System.out.println(currentPlayer.getName() + " wins!");
                    break;
                }
                win = board.checkWinner("O");
                if (win) {
                    System.out.println(currentPlayer.getName() + " wins!");
                    switchPlayer();
                    break;
                }
                switchPlayer();
            }
        System.out.print("Would you like to play again? ");
        String choice = input.next();
        if (choice.equals("yes"))
            for (int i = 0; i < board.size; i++) {
            for (int j = 0; j < board.size; j++) {
                board.grid[i][j] = ".";
            }
            notFull = true;
            win = false;
            } else {
                System.out.println("Bye");
                playing = false;
            } 
        }
    }



}
