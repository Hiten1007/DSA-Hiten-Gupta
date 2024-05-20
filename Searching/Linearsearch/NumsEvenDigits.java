package Searching.Linearsearch;

public class NumsEvenDigits{
    public static void main(String[] args) {
        int[] arr = {23, 1, 456, 1274, 9};
        System.out.println(numberofevendigits(arr));
    }
    static int numberofevendigits(int[] arr){
        int count = 0;
        for(int element : arr){
            if(even(element)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int digits = digits(num);
        return (digits%2) == 0;
    }
    static int digits(int num){
        if(num < 0){
            num *= -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}
