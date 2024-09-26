package Recursion.RecursionQuestions;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 6, 8, 9};
        int target = 2;
        System.out.println(binarySearch(nums, target));
    }
    static int binarySearch(int[] nums, int target){
        return helper(nums, target, 0, nums.length - 1);
    }
    static int helper(int[] nums, int target, int s, int e){
        if(s > e){
            return -1;
        }

        int mid = s + (e - s)/2;
        if(nums[mid] == target){
            return mid;
        }
        if(nums[mid] > target){
            return helper(nums, target, s, mid - 1);
        }

        return helper(nums, target, mid + 1, e);
    }
}
