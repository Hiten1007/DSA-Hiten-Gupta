package Searching.BinarySearch;

public class FindNumberOfRotationsArray {
    public static void main(String[] args) {
        int[] arr = {4, 7, 12, 19, 21, 1, 3};
        System.out.println(count(arr));
    }
    static int count(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid + 1;
            }
            if(mid > start && arr[mid - 1] > arr[mid]){
                return mid;
            }
            if(arr[start] >= arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
