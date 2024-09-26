package arrays;

import java.util.Arrays;

public class ReshapeMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5, 6, 7, 8}};
        int[][] arr2 = (matrixReshape(arr, 4, 2));
        for(int[]a : arr2){
            System.out.println(Arrays.toString(a));
        }
    }
    static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(r*c != m*n){
            return new int[][]{{-1, -1}};
        }
        int row = 0;
        int col = 0;
        int[][] arr = new int[r][c];
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }
        return arr;
    }
}
