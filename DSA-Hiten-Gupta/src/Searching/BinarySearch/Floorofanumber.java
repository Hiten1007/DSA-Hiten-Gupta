package Searching.BinarySearch;

public class Floorofanumber {
    public static void main(String[] args) {
        int[] arr = {2, 5, 11, 14, 17, 23};
        int target = 15;
        System.out.print(floor(arr, target));
        int num = 0;
        System.out.println(Integer.MAX_VALUE);
    }
    static int floor(int[] arr, int target){
        if(target < arr[0]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
