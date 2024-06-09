package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 6, 7, 26, 48, 59, 69, 79, 89, 95};
        int target = 79;
        System.out.println(binarysearch(arr, target, 0, arr.length - 1));
    }
    static int binarysearch(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int mid = s + (e - s)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target){
            return binarysearch(arr, target, s, mid - 1);
        }
        return binarysearch(arr, target, mid + 1, e);
    }
}
