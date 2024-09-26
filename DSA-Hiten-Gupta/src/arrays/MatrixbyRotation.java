package arrays;

import java.util.Arrays;

public class MatrixbyRotation {
    public static void main(String[] args) {
        int[][] arr = {
                {1,0,1},
                {0,1,1},
                {1,1,0}};
        int[][] arr3 = {
                {1, 0, 1},
                {1, 1, 0},
                {0, 1, 1}};

        System.out.print(findRotation(arr, arr3));
    }

    static boolean findRotation(int[][] mat, int[][] target) {
        int[][] newm = rotate(mat);
        for(int i = 0; i < 3; i++){
            if(same(newm, target)){
                return true;
            }
            newm = rotate(newm);
        }
        return false;
    }

    static int[][] rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0]. length;
        int[][] arr = new int[m][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[j][n-i-1] = matrix[i][j];
            }
        }

        return arr;
    }
    static boolean same(int[][]arr, int[][]arr2){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j]!=arr2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}