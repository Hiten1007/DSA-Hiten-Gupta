package Recursion.RecursionQuestions;

import java.util.Arrays;

public class SumTrianglefromarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        sumTriangleFromArray(arr);
    }
    static void sumTriangleFromArray(int[] arr){
        if(arr.length == 1){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int[] ans = new int[arr.length - 1];
        int i = 0;
        while(i < arr.length){
            if(i < arr.length - 1) {
                ans[i] = arr[i] + arr[i + 1];
            }
            i++;
        }
        sumTriangleFromArray(ans);
        System.out.println(Arrays.toString(arr));
    }
}
