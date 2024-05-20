package Searching.BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {51, 38, 32, 25, 21, 16, 12, 9, 5};
        int target = 21;
        System.out.println(orderagnostic(arr, target));
    }
    static int orderagnostic(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        boolean Asc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(Asc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
