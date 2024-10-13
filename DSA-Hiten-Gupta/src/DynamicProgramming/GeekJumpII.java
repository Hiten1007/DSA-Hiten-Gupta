package DynamicProgramming;

import java.util.Arrays;

public class GeekJumpII {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return min(0, nums, dp);
    }
    public int min(int i, int[] arr, int[] dp){
        if(arr[i] == 0 && i != arr.length - 1){
            return Integer.MAX_VALUE - 40;
        }
        if(i == arr.length - 1){
            return 0;
        }
        if(dp[i] != - 1){
            return dp[i];
        }

        int min = Integer.MAX_VALUE - 40;
        for(int j = 1; j <= arr[i] && i + j < arr.length; j++){
            min = Math.min(min, min(i + j, arr, dp));
        }
        return dp[i] = min + 1;
    }

    public int tab(int[] nums){
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == 0){
                dp[i] = Integer.MAX_VALUE - 40;
            }
        }
        dp[nums.length - 1] = 0;

        for(int i = nums.length - 2; i >= 0; i--){
            int min = Integer.MAX_VALUE - 40;
            for(int j = 1; j <= nums[i] && i + j < nums.length; j++){
                min = Math.min(min, dp[i + j]);
            }
            dp[i] = min + 1;
        }

        return dp[0];
    }
}
