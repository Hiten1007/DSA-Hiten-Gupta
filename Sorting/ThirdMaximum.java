package Sorting.SortingQuestions;

import java.util.*;

public class ThirdMaximum {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 2};
        System.out.println(thirdMax(arr));
    }
    static int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        int[] maxarr = new int[set.size()];
        int x = 0;
        int max = Integer.MIN_VALUE;
        for(int element : set){
            maxarr[x++] = element;
            max = Math.max(element, max);
        }
        if(set.size() <= 2) {
            return max;
        }
        int max2 = Integer.MIN_VALUE;
        for(int i = 0; i < maxarr.length; i++){
            if(maxarr[i] != max){
                max2 = Math.max(max2, maxarr[i]);
            }
        }
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < maxarr.length; i++){
            if(maxarr[i] != max && maxarr[i] != max2){
                ans = Math.max(ans, maxarr[i]);
            }
        }
        return ans;
    }
}
