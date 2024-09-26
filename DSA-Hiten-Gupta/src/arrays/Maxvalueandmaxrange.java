package arrays;

import java.util.*;

public class Maxvalueandmaxrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter first index here : ");
        int idx1 = sc.nextInt();
        System.out.print("Enter second index here : ");
        int idx2 = sc.nextInt();
        System.out.println("The maximum value in the arrays is : " + max(arr));

        System.out.print("The maximum value over the range of index " + idx1 + " and " + idx2 + " is : " + maxrange(arr, idx1 , idx2));
    }

    static int maxrange(int[] arr, int start, int end){
        if(start > end){
            return -1;
        }
        if(arr == null){
            return -1;
        }
        int max = arr[start];
        for(int i = start; i < end; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int max(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
