package Sorting.SortingQuestions;

import java.util.*;

public class FourSum {
    public static void main(String[] args) {

    }
    static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int k = j + 1;
                int l = n - 1;
                while(k < l){
                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum == target){
                        List<Integer> al = new ArrayList<>();
                        al.add(nums[i]);
                        al.add(nums[j]);
                        al.add(nums[k]);
                        al.add(nums[l]);

                        set.add(al);
                        k++;
                        l--;
                    }
                    else if(sum < target) k++;
                    else if(sum > target) l--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
