package Searching.SearchingPracticeQuestions;

public class NegativeNumbersInMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        System.out.println(count(mat));
    }
    static int count(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int row = 0;
        int col = cols - 1;
        int count = 0;
        while(row < rows && col >= 0){
            if(matrix[row][col] >= 0){
                row++;
            }
            else{
                count += rows - row;
                col--;
            }
        }
        return count;
    }
}
