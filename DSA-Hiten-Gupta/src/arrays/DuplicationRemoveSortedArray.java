package arrays;

import java.util.*;

public class DuplicationRemoveSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 2, 3, 3, 4, 5};
        System.out.println(removeDuplicates(arr));
    }
    static int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=1; i<nums.length;i++)
        {
            if(nums[i] != nums[(j)])
            {

                nums[++j] = nums[i];
            }
        }
        return ++j;
    }
}
