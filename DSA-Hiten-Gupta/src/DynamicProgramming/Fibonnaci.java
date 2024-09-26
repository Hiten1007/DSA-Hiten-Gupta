package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class Fibonnaci {
    public static void main(String[] args) {
        int n = 25;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(fi(n));
    }
    //memoization
    static int f(int n, int[] dp){
        if(n <= 1){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        return dp[n] = f(n - 1, dp) + f(n - 2, dp);
    }
    //tabulation
    static int f(int n){
        if(n <= 1){
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
    static int fi(int n){
        if(n <= 1){
            return n;
        }
        int first = 0;
        int second = 1;
        for(int i = 2; i <= n; i++){
            int next = first + second;
            first = second;
            second = next;
        }
        return second;
    }
}
