package arrays;

import java.util.*;

public class Concatenationofarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
            System.out.print(Arrays.toString(getConcatenation(arr)));

    }
    static int[] getConcatenation(int[] nums) {
        int[] arr = new int[2*nums.length];
        int i = 0;
        while(i<nums.length) {
            arr[i] = nums[i];
            arr[i+nums.length] = nums[i];
            i++;
        }

        return arr;
    }
}
