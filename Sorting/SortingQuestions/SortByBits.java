package Sorting.SortingQuestions;

import java.util.Arrays;

public class SortByBits {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 5, 8, 0};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }
    static int[] sortByBits(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(Integer.bitCount(arr[j]) < Integer.bitCount(arr[j - 1])){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                else if(Integer.bitCount(arr[j]) == Integer.bitCount(arr[j - 1])){
                    if(arr[j] < arr[j - 1]){
                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                    }
                }
            }
        }
        return arr;
    }
    static int numberofbits(int n){
        int count = 0;
        while(n > 0){
            if((n&1) == 1){
                count++;
            }
            n >>= 1;
        }
        return count;
    }
}
