package Sorting.SortingQuestions;

import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] arr = { -4, -1, 2, 10};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
    static int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        int[] sqarr = new int[nums.length];
        while(left < right){
            int numleft = (int)Math.pow(nums[left], 2);
            int numright = (int)Math.pow(nums[right], 2);
            if(numleft > numright){
                sqarr[index--] = numleft;
                left++;
            }
            else if(numleft < numright){
                sqarr[index--] = numright;
                right--;
            }
            else{
                sqarr[index--] = numleft;
                sqarr[index--] = numright;
                left++;
                right--;
            }
        }
        if(left == right) sqarr[index] = (int)Math.pow(nums[left], 2);
        return sqarr;
    }
}
