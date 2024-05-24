package arrays;

import java.util.Arrays;

public class SpiralMatrixII {
    public static void main(String[] args) {
        int n = 4;
        int[][] mat = generateMatrix(n);
        for(int[] a : mat){
            System.out.println(Arrays.toString(a));
        }
    }
    static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int index = 1;

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                matrix[top][i] = index++;
            }
            top++;

            for(int i = top; i <= bottom; i++){
                matrix[i][right] = index++;
            }
            right--;

            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    matrix[bottom][i] = index++;
                }
                bottom--;
            }

            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    matrix[i][left] = index++;
                }
                left++;
            }
        }
        return matrix;
    }
}
