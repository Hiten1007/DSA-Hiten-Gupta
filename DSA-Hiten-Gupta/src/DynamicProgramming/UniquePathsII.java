package DynamicProgramming;

import java.util.Arrays;

public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1){
            return 0;
        }

        int[][] dp = new int[m][n];
        for(int[] dps : dp){
            Arrays.fill(dps, -1);
        }
        return paths(m - 1, n - 1, obstacleGrid, dp);
    }

    //memoization
    public int paths(int m, int n, int[][] obstacleGrid, int[][] dp){
        if(m < 0 || n < 0){
            return 0;
        }
        if(obstacleGrid[m][n] == 1){
            return 0;
        }
        if(m == 0 && n == 0){
            return 1;
        }
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        return dp[m][n] = paths(m, n- 1, obstacleGrid, dp) + paths(m - 1, n, obstacleGrid, dp);
    }

    //tabulation
    public int paths(int[][] obstacleGrid){
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        if(obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1){
            return 0;
        }

        int[][] dp = new int[m][n];

        for(int[] dps : dp){
            Arrays.fill(dps, -1);
        }
        dp[0][0] = 1;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

                if(i == 0 && j == 0){
                    continue;
                }
                if(obstacleGrid[i][j] != 1){
                    int x = i > 0 ? (obstacleGrid[i - 1][j] == 1 ? 0 : dp[i - 1][j]) : 0;
                    int y = j > 0 ? (obstacleGrid[i][j - 1] == 1 ? 0 : dp[i][j - 1]) : 0;
                    dp[i][j] = x + y;
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
