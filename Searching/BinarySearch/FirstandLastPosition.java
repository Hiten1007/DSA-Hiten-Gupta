package Searching.BinarySearch;

import java.util.Arrays;

public class FirstandLastPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 4, 8, 9, 9, 9, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchrange(arr, target)));
    }
    static int[] searchrange(int[] nums, int target){
        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        if(ans[0]!=-1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }
    static int search(int[] arr, int target, boolean findstart){
        int ans = -1;
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
                ans = mid;
                if(findstart){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
