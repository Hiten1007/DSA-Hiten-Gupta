package Searching.BinarySearch;

public class DuplicateValuesRotatedBinarySearch{
    public static void main(String[] args) {
        int[] arr = {5, 7, 11, 13, 19, 2, 2, 4};
        int target = 4;
        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target){
        int pivot = findpivot(arr);
        if(pivot == -1){
            return BinarySearch(arr, target, 0, arr.length - 1);
        }
        if(arr[pivot] == target){
            return pivot;
        }
        if(target > arr[0]){
            return BinarySearch(arr, target, 0, pivot - 1);
        }
        return BinarySearch(arr, target, pivot + 1, arr.length - 1);
    }
    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(end > mid && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(start < mid && arr[mid- 1] > arr[mid]){
                return mid - 1;
            }
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if(arr[end - 1] > arr[end]){
                    return end - 1;
                }
                end--;
            }
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    static int BinarySearch(int[] arr, int target, int start, int end){
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
