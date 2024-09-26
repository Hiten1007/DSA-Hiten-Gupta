package Sorting.SortingQuestions;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[correct] != nums[i]) {
                    swap(nums, correct, i);
                }
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
