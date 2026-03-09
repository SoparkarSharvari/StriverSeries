package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class nQueens {
    public static void main(String[] args) {
        int n=4;
        System.out.println(solveNQueens(n));
     }
     public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }
        solveNQueensHelper(board, 0, result);
        return result;
    }
    public static void solveNQueensHelper(char[][] board, int col , List<List<String>> result){
        if(col == board.length){
             List<String> temp = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                temp.add(new String(board[i]));
            }
            result.add(temp);
            return;
        }
        for(int row=0; row<board.length; row++){
        if(isSafe(board, row, col)){
            board[row][col] = 'Q';
            solveNQueensHelper(board, col+1, result);
            board[row][col] = '.';
        }
    }
    }
    public static boolean isSafe(char[][] board, int row, int col){

        // only checking the left side because we are placing the queen column by column from left to right and we are checking for the current column only so there is no need to check the right side because there is no queen placed on the right side yet.
        //check up 
        for (int j = 0; j < col; j++) {
            if (board[row][j] == 'Q') return false;
        }
        //check upper left diagonal
        for (int i = row , j= col ; j>=0 && i >=0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        //check lower left diagonal
        for (int i= row , j= col ; j >=0 && i < board.length; i++, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
