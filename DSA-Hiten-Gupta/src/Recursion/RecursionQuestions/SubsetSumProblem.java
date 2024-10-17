package DynamicProgramming;

import java.util.Arrays;

public class SubsetSumProblem {
    public static void main(String[] args) {
        int[] arr = {3, 12, 5, 2};
        System.out.println(isSubsetSum(4, arr, 9));
    }
    static Boolean isSubsetSum(int N, int arr[], int sum){
        boolean[] dp = new boolean[N + 1];
        Arrays.fill(dp, false);

        return memo(N, arr, sum, dp);
    }
    static boolean memo(int N, int[] arr, int sum, boolean[] dp){
        if(sum == 0){
            return true;
        }
        if(dp[N]){
            return dp[N];
        }
        boolean ans = false;
        for(int i = N - 1; i >= 0; i--){
            if(sum - arr[i] >= 0) {
                ans = ans || isSubsetSum(i, arr, sum - arr[i]);
            }
        }
        return dp[N] = ans;
    }

}
