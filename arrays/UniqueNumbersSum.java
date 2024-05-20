package arrays;

import java.util.Arrays;

public class UniqueNumbersSum {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(Arrays.toString(sumZero(n)));
    }
    static int[] sumZero(int n) {
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0; i < n-1; i++){
            sum += i + 1;
            arr[i] = i + 1;
        }
        arr[n - 1] = sum*-1;
        return arr;
    }
}
