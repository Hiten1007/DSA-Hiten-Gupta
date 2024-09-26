package arrays;

import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 12, 17};
        int k = 2;
        System.out.println(Arrays.toString(rotate(arr, k)));
    }
    static int[] rotate(int[] arr, int k){
        k = k % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr,0, k - 1);
        reverse(arr, k, arr.length - 1);

        return arr;
    }
    static void reverse(int[] arr, int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
