package Searching.SearchingPracticeQuestions;

import java.util.Arrays;

public class FairCandySwap {
    public static void main(String[] args) {

    }
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int alicetotal = 0;
        int bobtotal = 0;
        int m = aliceSizes.length;
        int n = bobSizes.length;
        for(int i = 0; i < m; i++){
            alicetotal+=aliceSizes[i];
        }
        for(int i = 0; i < n; i++){
            bobtotal += bobSizes[i];
        }
        Arrays.sort(bobSizes);
        for(int i = 0; i < m; i++){
            int target = (bobtotal + 2 * aliceSizes[i] - alicetotal)/2;
            if(binarysearch(bobSizes, target)){
                return new int[]{aliceSizes[i], target};
            }
        }
        return new int[0];
    }

    static boolean binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return true;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
}
