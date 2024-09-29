package DynamicProgramming;

import java.util.Arrays;

public class HouseRobber2 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 3, 7};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int[] arr1 = Arrays.copyOfRange(nums, 0, nums.length - 1);
        int[] arr2 = Arrays.copyOfRange(nums, 1, nums.length);

        if(nums.length == 1){
            return nums[0];
        }

        return Math.max(tab(arr1), tab(arr2));
    }
    static int tab(int[] nums){
        int n = nums.length;
        int first  = 0;
        int second = nums[0];
        for(int i = 2; i <= n; i++){
            int next = Math.max(second, nums[i - 1] + first);
            first = second;
            second = next;
        }
        return second;
    }
}
