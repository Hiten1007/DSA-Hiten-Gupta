package Recursion.MazeProblemsandBacktracking;

import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = { { 3, 1, 6, 5, 7, 8, 4, 9, 2 },
                { 5, 2, 9, 1, 3, 4, 7, 6, 8 },
                { 4, 8, 7, 6, 2, 9, 5, 3, 1 },
                { 2, 6, 3, 0, 1, 5, 9, 8, 7 },
                { 9, 7, 4, 8, 6, 0, 1, 2, 5 },
                { 8, 5, 1, 7, 9, 2, 6, 4, 3 },
                { 1, 3, 8, 0, 4, 7, 2, 0, 6 },
                { 6, 9, 2, 3, 5, 1, 8, 7, 4 },
                { 7, 4, 5, 0, 8, 6, 3, 1, 0 } };
        if(solve(board)){
            display(board);
        }
        else{
            System.out.println("No possible solution");
        }
    }

    static void display(int[][] board){
        for(int[] arr : board){
            System.out.println(Arrays.toString(arr));
        }
    }

    static boolean solve(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean EmptyLeft = true;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    EmptyLeft = false;
                    break;
                }
            }
            if(!EmptyLeft){
                break;
            }
        }
        if(EmptyLeft){
            return true;
        }
        for(int number = 1; number <= 9; number++){
            if(isSafe(board,row, col, number)){
                board[row][col] = number;
                if(solve(board)){
                    return true;
                }
                else{
                    board[row][col] = number;
                }
            }
        }
        return false;
    }
    static boolean isSafe(int[][] board, int row, int col, int num){
        for(int i = 0; i < board.length; i++){
            if(board[row][i] == num){
                return false;
            }
        }
        for(int i = 0; i < board.length; i++){
            if(board[i][col] == num){
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int sRow = row - row % sqrt;
        int sCol = col - col % sqrt;
        for(int i = sRow; i < sRow + sqrt; i++){
            for(int j = sCol; j < sCol + sqrt; j++){
                if(board[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }
}
