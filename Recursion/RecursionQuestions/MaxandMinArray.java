package Recursion.RecursionQuestions;

public class MaxandMinArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 6, 1, 3, 2};
        System.out.println(maxEle(arr, arr.length));
        System.out.println(minEle(arr, arr.length));
    }
    static int maxEle(int[] arr, int n){
         if(n == 0){
             return arr[0];
         }
         return (Math.max(arr[n - 1], maxEle(arr, n - 1)));
    }
    static int minEle(int[] arr, int n){
        if(n == 0){
            return arr[0];
        }
        return (Math.min(arr[n - 1], minEle(arr, n - 1)));
    }
}
