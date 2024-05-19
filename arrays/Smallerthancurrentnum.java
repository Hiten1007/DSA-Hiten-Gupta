package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Smallerthancurrentnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            count[nums[i]]++;
        }
        for(int i = 1; i < 101; i++){
            count[i] += count[i - 1];
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                res[i] = 0;
            }
            else {
                res[i] = count[nums[i] - 1];
            }
        }
        return res;
    }
}
