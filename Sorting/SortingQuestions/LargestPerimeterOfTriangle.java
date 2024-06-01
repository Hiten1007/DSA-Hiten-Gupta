package Sorting.SortingQuestions;

import java.util.Arrays;

public class LargestPerimeterOfTriangle {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 3};
        System.out.println(largestPerimeter(arr));
    }
    static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = n - 1; i >= 2; i--){
            int a = nums[i];
            int b = nums[i - 1];
            int c = nums[i - 2];
            if(a < b + c) return a + b + c;
        }
        return 0;
    }
}
