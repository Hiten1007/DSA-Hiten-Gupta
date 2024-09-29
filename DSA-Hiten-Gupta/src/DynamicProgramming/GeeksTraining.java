package DynamicProgramming;

import java.util.Arrays;

public class GeeksTraining {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 5}, {3, 1, 1}, {3, 3, 3}};
        System.out.println(optimize(arr, 3));
    }

    static int maximumPoints(int arr[][], int N) {
        int[][] dp = new int[N][4];
        for (int[] dps : dp) {
            Arrays.fill(dps, -1);
        }
        return max(arr, N - 1, 3, dp);
    }

    //memoization
    static int max(int[][] arr, int n, int last, int[][] dp) {
        if (n == 0) {
            int max = 0;
            for (int i = 0; i < 3; i++) {
                if (i != last) {
                    max = Math.max(max, arr[n][i]);
                }
            }
            return max;
        }
        if (dp[n][last] != -1) {
            return dp[n][last];
        }
        int maxi = 0;
        for (int i = 0; i < 3; i++) {
            if (i != last) {
                maxi = Math.max(maxi, arr[n][i] + max(arr, n - 1, i, dp));
            }
        }
        return dp[n][last] = maxi;
    }

    //tabulation
    static int tab(int[][] arr, int N) {
        int[][] dp = new int[N][4];

        dp[0][0] = Math.max(arr[0][1], arr[0][2]);
        dp[0][1] = Math.max(arr[0][0], arr[0][2]);
        dp[0][2] = Math.max(arr[0][1], arr[0][0]);
        dp[0][3] = Math.max(arr[0][1], Math.max(arr[0][0], arr[0][2]));

        for (int day = 1; day < N; day++) {
            for (int j = 0; j < 4; j++) {
                dp[day][j] = 0;
                for (int k = 0; k < 3; k++) {
                    if (k != j) {
                        dp[day][j] = Math.max(dp[day][j], arr[day][k] + dp[day - 1][k]);
                    }
                }
            }
        }
        return dp[N - 1][3];
    }

    //space optimization
    static int optimize(int[][] arr, int N){
        int[] ans  = new int[4];
        ans[0] = Math.max(arr[0][1], arr[0][2]);
        ans[1] = Math.max(arr[0][0], arr[0][2]);
        ans[2] = Math.max(arr[0][1], arr[0][0]);
        ans[3] = Math.max(arr[0][1], Math.max(arr[0][0], arr[0][2]));
        for (int day = 1; day < N; day++) {
            int[] temp = new int[4];
            for (int j = 0; j < 4; j++) {
               temp[j] = 0;
                for (int k = 0; k < 3; k++) {
                    if (k != j) {
                        temp[j] = Math.max(temp[j], arr[day][k] + ans[k]);
                    }
                }
            }
            ans = temp;
        }
        return ans[3];
    }
}