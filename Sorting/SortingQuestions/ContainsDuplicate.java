package Sorting.SortingQuestions;

import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {14, 1, 2, 4, 2, 6, 3, 0};
        System.out.println(containsDuplicate(arr));
    }
    static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = set.size();
            set.add(nums[i]);
            if(set.size() == temp){
                return true;
            }
        }
        return false;
    }
}
