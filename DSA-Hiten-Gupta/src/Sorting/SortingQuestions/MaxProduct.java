package Sorting.SortingQuestions;

import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 6, 1};
        System.out.println(maxProduct(arr));
    }
    static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length -2] -1);
    }
}
