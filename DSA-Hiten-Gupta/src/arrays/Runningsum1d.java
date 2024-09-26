package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Runningsum1d {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.print("Enter the size of the array : ");
         int n = in.nextInt();
         int[] arr = new int[n];

         for(int i = 0; i < arr.length; i++){
             arr[i] = in.nextInt();
         }
        System.out.print(Arrays.toString(runningsum(arr)));
    }
    static int[] runningsum(int[] nums){
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            ans[i] = ans[i - 1] + nums[i];
        }
        return ans;
    }
}
