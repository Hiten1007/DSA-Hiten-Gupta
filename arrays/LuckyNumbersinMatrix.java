package arrays;

import java.util.*;

public class LuckyNumbersinMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {2, 3, 4},
                {3, 4, 5}};
        System.out.print(luckyNumbers(arr));
    }
    static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ret = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int minIndex = findMinIndex(matrix[i]);
            int minValue = matrix[i][minIndex];

            if (isMaxInColumn(matrix, minValue, minIndex)) {
                ret.add(minValue);
            }
        }

        return ret;
    }

    static int findMinIndex(int[] row) {
        int minIndex = 0;
        for (int j = 1; j < row.length; j++) {
            if (row[j] < row[minIndex]) {
                minIndex = j;
            }
        }
        return minIndex;
    }

    static boolean isMaxInColumn(int[][] matrix, int value, int colIndex) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][colIndex] > value) {
                return false;
            }
        }
        return true;
    }
}
