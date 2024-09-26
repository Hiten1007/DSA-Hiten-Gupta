package DynamicProgramming;

import java.util.Arrays;

public class FrogJumpKSteps {
    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 50, 20};
        int k = 3;
        System.out.println(f(arr, k));
    }
    static int minimizeCost(int k, int arr[]) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return f(k, arr, n - 1, dp);
    }

    //memoization
    static int f(int k, int[] arr, int n, int[] dp){
        if(n == 0){
            return 0;
        }

        int x = Integer.MAX_VALUE;
        for(int i = 1; i <= k; i++){
            if(i <= n){
                if(dp[n - i] != -1){
                    x = Math.min(dp[n - i] +  Math.abs(arr[n] - arr[n - i]), x);
                }
               else{
                    x = Math.min(f(k, arr, n - i, dp) +  Math.abs(arr[n] - arr[n - i]), x);
                }
            }
        }
        return dp[n] = x;
    }

    //tabulation
    static int f(int[] arr, int k){
        int n = arr.length;
        int[] dp = new int[k];

        dp[0] = 0;

        for(int i = 1; i < n; i++){
            int x = Integer.MAX_VALUE;
            for(int j = 1; j <= k && j <= i; j++){
                x = Math.min(dp[i - j] + Math.abs(arr[i] - arr[i - j]), x);
            }
            dp[i] = x;
        }
        return dp[n - 1];
    }
}
