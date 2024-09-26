package Sorting.SortingQuestions;

import java.util.Arrays;

public class SortArraybyParityII {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 6, 7, 9};
        System.out.println(Arrays.toString(sortArrayByParityII(arr)));
    }
    static int[] sortArrayByParityII(int[] nums) {
        int j = 0;
        int k = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0 && j < nums.length){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j += 2;
            }
        }
        return nums;
    }
}
