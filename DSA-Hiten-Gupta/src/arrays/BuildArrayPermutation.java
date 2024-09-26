package arrays;

import java.util.*;

public class BuildArrayPermutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.print(Arrays.toString(buildArray(arr)));
    }

    static int[] buildArray(int[] nums) {
       int[] ans = new int[nums.length];
       int i = 0;
       while(i < ans.length){
          ans[i] = nums[nums[i]];
          i++;
       }
       return ans;
    }
}

