package arrays;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] mat = {
                {1,1,1},
                {1,1,1},
                {1,1,1}};
        System.out.println(diagonalSum(mat));
    }
    static int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i = 0; i < mat.length; i++){
            sum += mat[i][i];
            if(!(i==mat.length - i-1)){
                sum+=mat[i][mat.length - i - 1];
            }
        }
        return sum;
    }
}
