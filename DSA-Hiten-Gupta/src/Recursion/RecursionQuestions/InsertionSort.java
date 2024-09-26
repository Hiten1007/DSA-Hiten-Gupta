package Recursion.RecursionQuestions;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        insertionSort(arr, 5);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr, int n){
        if(n <= 1){
            return;
        }

        insertionSort(arr, n - 1);

        int last = arr[n - 1];
        int j = n - 2;

        while(j >= 0 && arr[j] > last){
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
    }
}
