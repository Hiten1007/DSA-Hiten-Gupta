package Sorting.SortingQuestions;

import java.util.*;

public class AllNumbersDisapperaed {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 1, 4};
        System.out.println(findDisappearedNumbers(arr));
    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[correct] != nums[i]){
                swap(nums, correct, i);
            }
            else{
                i++;
            }
        }
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                list.add(index + 1);
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
