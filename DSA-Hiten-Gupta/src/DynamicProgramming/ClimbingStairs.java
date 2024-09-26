package DynamicProgramming;

import java.util.Arrays;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 7;
        int[] dp = new int[n + 2];
        Arrays.fill(dp, -1);
        System.out.println(climbStairs(n, dp));
    }
    static int climbStairs(int n, int[] dp) {
        int first = 0;
        int second = 1;
        for(int i = 2; i < n + 2; i++){
            int next = first + second;
            first = second;
            second = next;
        }
        return second;
    }
}
