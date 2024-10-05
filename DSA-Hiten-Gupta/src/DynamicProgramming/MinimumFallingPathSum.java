package DynamicProgramming;

import java.util.Arrays;

public class MinimumFallingPathSum {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 1, 3},
                {6, 5, 4},
                {7, 8, 9}
        };
        System.out.println(tab(matrix));
    }
    static int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int ans = Integer.MAX_VALUE;
        int[][] dp = new int[m][n];
        for(int[] dps : dp){
            Arrays.fill(dps, -1);
        }
        for(int i = 0; i < m; i++){
            ans = Math.min(minSum(n - 1, i, matrix, dp), ans);
        }
        return ans;
    }
    //memoization
    static int minSum(int i, int j, int[][] matrix, int[][] dp){
        if(j < 0 || j == matrix[0].length){
            return Integer.MAX_VALUE;
        }
        if(i == 0){
            return matrix[i][j];
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        return dp[i][j] = matrix[i][j] + Math.min(minSum(i - 1, j - 1, matrix, dp), Math.min(minSum(i - 1, j, matrix, dp), minSum(i - 1, j + 1, matrix, dp)));
    }

    //tabulation
    static int tab(int[][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;
        int[] dp = new int[m];
        Arrays.fill(dp, -1);

        for(int i = 0; i < m; i++){
            dp[i] = matrix[0][i];
        }

        for(int i = 1; i < n; i++){
            int[] temp = new int[m];
            for(int j = 0; j < m; j++){
                int k = j > 0 ? dp[j - 1] : Integer.MAX_VALUE;
                int l = dp[j];
                int p = j < m - 1 ? dp[j + 1] : Integer.MAX_VALUE;
                temp[j] = matrix[i][j] + Math.min(k, Math.min(l, p));
            }
            dp = temp;
        }

        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < m; i++){
            ans = Math.min(ans, dp[i]);
        }
        return ans;
    }
}
