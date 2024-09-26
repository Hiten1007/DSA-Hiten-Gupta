package StacksandQueues.StacksAndQueuesQuestions;

import java.util.Arrays;

public class TwoStacks {
    static int TwoStacks(int x, int[] a, int[] b){
        return helper(x, a, b, 0, 0) - 1;
    }
    private static int helper(int x, int[] a, int[] b, int sum, int count){
        if(sum > x){
            return count;
        }

        if(a.length == 0 || b.length == 0){
            return count;
        }

        int ans1 = helper(x, Arrays.copyOfRange(a, 1, a.length), b, sum + a[0], count + 1);
        int ans2 = helper(x, a,  Arrays.copyOfRange(b, 1, b.length), sum + b[0], count + 1);

        return Math.max(ans1, ans2);
    }
}
