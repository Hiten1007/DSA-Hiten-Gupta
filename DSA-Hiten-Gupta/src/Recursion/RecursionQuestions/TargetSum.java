package Recursion.RecursionQuestions;

public class TargetSum {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        System.out.println(findTargetSumWays(nums, target));
    }
    static int findTargetSumWays(int[] nums, int target) {
        int count = helper(nums, target, 0);
        return count;
    }
    static int helper(int[] nums, int target, int ind){
        if(ind == nums.length && target == 0){
            return 1;
        }
        if(ind == nums.length){
            return 0;
        }
        int count1 = 0;
        int count2 = 0;

           count1 +=  helper(nums, target - nums[ind], ind + 1);
           count2 += helper(nums, target + nums[ind], ind + 1);


        return count1 + count2;
    }
}
