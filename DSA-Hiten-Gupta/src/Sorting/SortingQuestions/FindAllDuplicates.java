package Sorting.SortingQuestions;

import java.util.*;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 4, 3, 2, 1};
        System.out.println(findDuplicates(arr));
    }
    static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int current = nums[i] - 1;
            if (nums[current] != nums[i]) {
                swap(nums, current, i);
            } else {
                i++;
            }
        }
        List<Integer>  list = new ArrayList<>();
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                list.add(nums[index]);
            }
        }
        return list;
    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
