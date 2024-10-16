package DynamicProgramming;

import java.util.Arrays;

public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(tab(3, 3));
    }
    static int uniquePaths(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for(int[] arr : dp){
            Arrays.fill(arr, -1);
        }
        return memo(m, n, dp);
    }
    static int memo(int m, int n, int[][] dp){
        if(m == 1 || n == 1){
            return 1;
        }
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        return dp[m][n] = memo(m-1, n, dp) + memo(m, n - 1, dp);
    }
    static int tab(int m, int n){
        int[][] dp = new int[m + 1][n + 1];
        int[] arr1 = new int[m + 1];
        int[] arr2 = new int[n + 1];
        for(int i = 1; i <= m; i++){
            arr1[i] = 1;
        }
        for(int j = 1; j <= n; j++){
           arr2[j] = 1;
        }

        for(int i = 2; i <= m; i++){
            for(int j = 2; j <= n; j++){
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m][n];
    }
}
