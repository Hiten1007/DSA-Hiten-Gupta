package arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {1, -8, 3, 2};
        System.out.println(maxSubArray(arr));
    }
    static int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int cursum = 0;
        for (int num : nums) {
            cursum = cursum + num;
            if (cursum > maxsum) {
                maxsum = cursum;
            }
            if (cursum < 0) {
                cursum = 0;
            }
        }
        return maxsum;
    }
}
