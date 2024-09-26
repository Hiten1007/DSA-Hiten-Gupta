package Recursion;

public class FindIfSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 2, 7, 8, 9};
        System.out.println(sorted(arr));
    }
    static boolean sorted(int[] arr){
        if(arr.length <= 1){
            return true;
        }
        int i = 0;
        return arr[0] < arr[1] && sortedarr(arr,i + 1);
    }
    static boolean sortedarr(int[] arr, int i){
        if(i == arr.length - 1){
            return true;
        }
        return arr[i] < arr[i + 1] && sortedarr(arr,i + 1);
    }
}
