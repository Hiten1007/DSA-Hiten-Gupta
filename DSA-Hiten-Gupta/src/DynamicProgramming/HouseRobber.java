package DynamicProgramming;

public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int n = nums.length - 1;
        return Math.max(collect(nums, n), collect(nums, n - 1));
    }
    static int collect(int[] nums, int n){
        if(n == 1 || n == 0){
            return nums[n];
        }
        int ans = Integer.MIN_VALUE;
        for(int i = 2; i <= n; i++){
            ans = Math.max(ans, nums[n] + collect(nums, n - i));
        }

        return ans;
    }
}
