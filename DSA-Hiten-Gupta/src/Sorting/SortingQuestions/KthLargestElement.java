package Sorting.SortingQuestions;

import java.util.Arrays;

public class KthLargestElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 1, 4, 6, 5, 7, 8, 2};
        int k = 3;
        System.out.println(findKthLargest(arr, k));
    }
    static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
