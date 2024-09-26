package Recursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 1, 2, 3, 4, 5};
        int target = 4;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }
    static int search(int[] arr, int target, int s, int e){
        if(s > e){
            return - 1;
        }
        int mid = s + (e - s)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] >= arr[s]){
            if(target >= arr[s] && arr[mid] >= target) {
                return search(arr, target, s, mid - 1);
            }
            else{
                return search(arr, target, mid + 1, e);
            }
        }
        if(arr[mid] <= target && target <= arr[e]){
            return search(arr, target, mid + 1, e);
        }
        return search(arr, target, s, mid - 1);
    }
}
