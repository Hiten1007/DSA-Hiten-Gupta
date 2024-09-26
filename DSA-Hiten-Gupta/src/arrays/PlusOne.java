package arrays;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9, 2, 9};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    static int[] plusOne(int[] digits) {
        int c = 0;
        digits[digits.length -1] += 1;
        for(int i = digits.length - 1; i >0; i--){
            digits[i] += c;
            if(digits[i]> 9){
                c = 1;
                digits[i] = digits[i] - 10;
            }
            else{
                c = 0;
            }
        }
        digits[0] += c;
        if(digits[0] > 9) {
            int n = digits.length + 1;
            int[] digitsn = new int[digits.length + 1];
            digitsn[0] = 1;
            digitsn[1] = digits[0] - 10;
            System.arraycopy(digits, 1, digitsn, 2, n - 2);
            return digitsn;
        }
        return digits;
    }
}
