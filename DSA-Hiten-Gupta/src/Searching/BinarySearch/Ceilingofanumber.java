package Searching.BinarySearch;

public class Ceilingofanumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 12, 17, 23, 29};
        int target = 18;
        System.out.print(ceiling(arr, target));
    }
    static int ceiling(int[] arr, int target) {
        if(target > arr[arr.length - 1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
       return start;
    }
}
