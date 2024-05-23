package Searching.BinarySearch;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 12, 0};
        int target = 0;
        System.out.println(search(arr, target));
    }

    static int search(int[] nums, int target){
        int pivot = findpivot(nums);
        if(pivot == -1){
            return BinarySearch(nums, target, 0, nums.length - 1);
        }
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return BinarySearch(nums, target, 0, pivot - 1);
        }
        return BinarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid - 1] > arr[mid]){
                return mid - 1;
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
