package arrays;

import java.util.*;

public class Shufflearray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.print(Arrays.toString(shuffle(arr, 3)));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];

        for(int i = 0 ; i < n; i++){
            ans[2*i] = nums[i];
            ans[2*i+1] = nums[n+i];
        }
        return ans;
    }
}
