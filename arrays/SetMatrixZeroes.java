package arrays;

import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int [][] mat = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(mat);
    }
    static void setZeroes(int[][] matrix) {
        int[] rows = new int[matrix.length];
        int[] cols = new int[matrix[0]. length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0]. length; j++){
                if(matrix[i][j] == 0){
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }
        for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[0].length; j++){
                    if(rows[i] == 1 || cols[j] == 1){
                        matrix[i][j] = 0;
                    }
            }
        }
        for(int[] a : matrix){
            System.out.println(Arrays.toString(a));
        }
    }
}
