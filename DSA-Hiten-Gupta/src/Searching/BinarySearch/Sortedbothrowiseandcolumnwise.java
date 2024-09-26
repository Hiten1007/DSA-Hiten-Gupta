package Searching.BinarySearch;

import java.util.Arrays;

public class Sortedbothrowiseandcolumnwise {
    public static void main(String[] args) {
        int[][] matrix = {{10, 20, 30, 40}, {12, 25, 32, 43}, {14, 26, 36, 47}, {17, 28, 39, 50}};
        int target = 37;
        System.out.println(Arrays.toString(search(matrix, target)));
    }
    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix[0].length-1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return new int[]{row,col};
            }
            else if(matrix[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
