package arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 26, 12, 8, 19, 6};
        int target = 38;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
    static int[] twoSum(int[] nums, int target) {
        for(int i = 1; i < nums.length; i++){
            for(int j = i ; j < nums.length; j++){
                if(nums[j] + nums[j-i] == target){
                    return new int[]{j, j-i};
                }
            }
        }
        return null;
    }
}
