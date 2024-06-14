package bitwise.bitwiseQuestions;

import java.util.Arrays;

public class DecodeXORedArray {
    public static void main(String[] args) {
        int[] encoded = {1, 4, 1, 5};
        int first = 2;
        System.out.println(Arrays.toString(decode(encoded, first)));
    }
    static int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;
        for(int i = 1; i < arr.length; i++){
            first = first^encoded[i - 1];
            arr[i] = first;
        }
        return arr;
    }
}
