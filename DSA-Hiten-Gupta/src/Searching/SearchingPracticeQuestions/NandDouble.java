package Searching.SearchingPracticeQuestions;

import java.util.Arrays;

public class NandDouble {
    public static void main(String[] args) {
        int[] arr = {2, 9, -1, 4, 0, -3, 1};
        System.out.println(checkIfExist(arr));
    }
    static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            if(binarysearch(i, arr)){
                return true;
            }
        }
        return false;
    }

    static boolean binarysearch(int idx, int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == 2 * arr[idx]){
                if(idx != mid){
                    return true;
                }
                else{
                    return false;
                }
            }
            else if(arr[mid] > 2*arr[idx]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return false;
    }
}
