/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TicTac;

/**
 *
 * @author jesse
 */
public class Board {

    String[][] grid;
    int size;

    public Board(int size) {
        this.size = size;
        this.grid = new String[size][size];
    }

    public Board(String[][] grid, int size) {
        this.grid = grid;
        this.size = size;
        
    }

    public boolean makeMove1(int row, int col, String symbol) {
        if (grid[row][col].equals(".")) {
            grid[row][col] = symbol;
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j].equals("")) {
                    return false;
                }
            }
        }
        //System.out.println("The game is a draw.");
        return true;
    }
    public void display() {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                count++;
                if (count < 3) {
                    System.out.print(grid[i][j] + " ");
                } else {
                    System.out.println(grid[i][j] + " ");
                    count = 0;
                }
            }
        }
        System.out.println();
    }
    public boolean checkWinner(String symbol) {
        if (grid[0][0].equals(symbol) && grid[0][1].equals(symbol) && grid[0][2].equals(symbol)) {
            return true;
        } else if (grid[1][0].equals(symbol) && grid[1][1].equals(symbol) && grid[1][2].equals(symbol)) {
            return true;
        } else if (grid[2][0].equals(symbol) && grid[2][1].equals(symbol) && grid[2][2].equals(symbol)) {
            return true;
        } else if (grid[0][0].equals(symbol) && grid[1][0].equals(symbol) && grid[2][0].equals(symbol)) {
            return true;
        } else if (grid[0][1].equals(symbol) && grid[1][1].equals(symbol) && grid[2][1].equals(symbol)) {
            return true;
        } else if (grid[0][2].equals(symbol) && grid[1][2].equals(symbol) && grid[2][2].equals(symbol)) {
            return true;
        } else if (grid[0][0].equals(symbol) && grid[1][1].equals(symbol) && grid[2][2].equals(symbol)) {
            return true;
        } else if (grid[0][2].equals(symbol) && grid[1][1].equals(symbol) && grid[2][0].equals(symbol)) {
            return true;
        } else {
            return false;
        }
    }
}  
