package Searching.SearchingPracticeQuestions;

public class SingleElementDuplicateArray {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(singleNonDuplicate(arr));
    }
    static int singleNonDuplicate(int[] nums) {
        if(nums.length == 0){
            return Integer.MIN_VALUE;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if((mid % 2) == 0){
                if(nums[mid] == nums[mid + 1]){
                    start = mid;
                }
                else{
                    end = mid;
                }
            }
            else{
                if(nums[mid - 1] == nums[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return nums[start];
    }
}
