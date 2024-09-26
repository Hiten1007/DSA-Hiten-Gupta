package DynamicProgramming;

import java.util.Arrays;

public class GeekJump {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 70, 40};
        System.out.println(f(arr, 5));
    }

    static int minimumEnergy(int arr[],int N){
        int[] dp = new int[N];
        Arrays.fill(dp, -1);
        return f(arr,N- 1, dp);
    }
    // memoization
    static int f(int[] arr, int i, int[] dp){
        if(i == 0){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int left = f(arr, i - 1, dp) + Math.abs(arr[i] - arr[i - 1]);
        int right = Integer.MAX_VALUE;
        if(i > 1){
            right = f(arr, i - 2, dp) + Math.abs(arr[i] - arr[i - 2]);
        }
        return dp[i] = Math.min(left, right);
    }

    //tabulation
    static int f(int[] arr, int n){
        int[] dp = new int[n];
        dp[0] = 0;
        for(int i = 1; i < n; i++){
            int left = dp[i - 1] + Math.abs(arr[i] - arr[i - 1]);
            int right = Integer.MAX_VALUE;
            if(i > 1){
                right = dp[i - 2] + Math.abs(arr[i] - arr[i - 2]);
            }
            dp[i] = Math.min(left, right);
        }
        return dp[n - 1];
    }

    //space optimization
    static int tab(int[] arr, int n){
        int first = 0;
        int second = 0;
        for(int i = 1; i < n; i++){
            int left = first + Math.abs(arr[i] - arr[i - 1]);
            int right = Integer.MAX_VALUE;
            if(i > 1){
                right = second + Math.abs(arr[i] - arr[i - 2]);
            }
            int ans = Math.min(left, right);
            second = first;
            first = ans;
        }
        return first;
    }
}
