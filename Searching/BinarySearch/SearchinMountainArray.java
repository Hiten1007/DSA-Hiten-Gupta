package Searching.BinarySearch;

public class SearchinMountainArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 10, 4, 2};
        int target = 4;
        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
