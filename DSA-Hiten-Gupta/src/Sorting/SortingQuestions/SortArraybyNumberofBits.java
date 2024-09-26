package Sorting.SortingQuestions;

import java.util.Arrays;

public class SortArraybyNumberofBits {
    public static void main(String[] args) {
        int[] arr = {40, 30, 10, 20};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }
    static int[] arrayRankTransform(int[] arr) {
        int[] arr2 = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            arr2[i] = arr[i];
        }
        Arrays.sort(arr2);

        for(int i = 0; i < arr.length; i++){
            arr[i] = rank(arr2, arr[i]);
        }
        return arr;
    }
    static int rank(int[] arr, int element){
        int[] count = new int[arr.length];
        for(int i = 1; i < count.length; i++){
            if(arr[i] == arr[i - 1]){
                count[i]++;
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                return i + 1;
            }
        }
        return 0;
    }
}
