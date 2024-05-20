package Searching.BinarySearch;

public class BasicBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 12, 18, 25, 29, 36};
        int target = 25;
        System.out.println(BinarySearch(arr, target));
    }
    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
