package Sorting.SortingQuestions;

import java.util.Arrays;

public class SortArraybyParity {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 8, 9, 1, 2, 3, 2, 1,2};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }
    static int[] sortArrayByParity(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if((nums[i] % 2) == 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return nums;
    }
}
