package arrays;

import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int[][] arr = {{1,0,1}, {0, 1, 1}};
        int[][] arr2 = flipAndInvertImage(arr);
        for(int []a : arr2){
            System.out.print(Arrays.toString((a)));
        }
    }
    static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            image[i] = flip(reverse(image[i]));
        }
        return image;
    }
    static int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start <=  end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    static int[] flip(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                arr[i] = 1;
            }
            else{
                arr[i] = 0;
            }
        }
        return arr;
    }
}
