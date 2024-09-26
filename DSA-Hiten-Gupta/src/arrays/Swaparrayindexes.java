package arrays;

import java.util.*;

public class Swaparrayindexes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter first index here : ");
        int idx1 = sc.nextInt();
        System.out.print("Enter second index here : ");
        int idx2 = sc.nextInt();
        swap(arr, idx1, idx2);
        System.out.print(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
