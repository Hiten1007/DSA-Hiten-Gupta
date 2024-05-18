package arrays;

import java.util.*;

public class GoodPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(numIdenticalPairs(arr));
    }
    static int numIdenticalPairs(int[] nums) {
        int[] arr = new int[102];
        for(int i : nums){
            arr[i]++;
        }
        int count = 0;
        for(int i : arr){
            count+= i*(i-1)/2;
        }
        return count;
    }
}
