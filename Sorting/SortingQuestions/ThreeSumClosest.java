package Sorting.SortingQuestions;

import java.util.*;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] arr = { 2, 1, -2, 1, 3, 4, -3, 7, 5, 4};
        System.out.println(threeSumClosest(arr, -12));
    }
    static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestsum =  nums[0] + nums[1] + nums[2];;
        for(int i = 0; i < nums.length - 2; i++){
            int j = i + 1;
            int k = nums.length - 1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(Math.abs(target - sum) < Math.abs(target - closestsum)){
                    closestsum = sum;
                }
                if(sum < target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return closestsum;
    }
}
