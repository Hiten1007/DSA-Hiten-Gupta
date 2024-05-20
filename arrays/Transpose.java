package arrays;

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr ={
                {1, 2, 3},
                {3, 4, 5}};
        int[][] ans = transpose(arr);
        for(int[] a : ans){
            System.out.println(Arrays.toString(a));
        }
    }
    static int[][] transpose(int[][] matrix) {
        int m = matrix[0].length;
        int n = matrix.length;
        int[][] arr = new int[m][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[j][i] = matrix[i][j];
            }
        }
        return arr;
    }
}

