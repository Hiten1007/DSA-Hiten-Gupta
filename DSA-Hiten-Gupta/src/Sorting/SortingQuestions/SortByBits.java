package Sorting.SortingQuestions;

import java.util.Arrays;

public class SortByBits {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 5, 8, 0, 10000};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }
    static int[] sortByBits(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            arr[i] += 10001 * Integer.bitCount(arr[i]);
        }
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] % 10001;
        }
        return arr;
    }
}
