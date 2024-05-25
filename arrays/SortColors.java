package arrays;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = {2, 0};
        sortColors(arr);
    }
    static void sortColors(int[] nums) {
        int n = nums.length;
        if(n == 2){
            int temp = nums[0];
            nums[0] = Math.min(nums[0], nums[1]);
            nums[1] = Math.max(temp, nums[1]);
            return;
        }
        if(n == 1){
            return;
        }
        int[] count = new int[3];
        for(int i = 0; i < nums.length; i++){
            count[nums[i]]++;
        }
        int j = nums.length - 1;
        for(int i = 2; i >= 0; i--){
            if(count[i] != 0){
                while(count[i] > 0) {
                    nums[j] = i;
                    j--;
                    count[i]--;
                }
            }
        }
    }
}
