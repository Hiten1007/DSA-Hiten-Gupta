package Searching.SearchingPracticeQuestions;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 9, 11};
        int target = 4;
        System.out.println(searchInsert(arr, target));
    }
    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }
}
