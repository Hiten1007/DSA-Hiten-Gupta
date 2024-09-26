package Sorting.SortingQuestions;

public class Missingnumber {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 1};
        System.out.println(missingNumber(arr));
    }
    static int missingNumber(int[] nums) {
        int index = 0;
        while(index < nums.length){
            int correct = nums[index];
            if(nums[index] < nums.length && nums[correct] != nums[index]){
                swap(nums, correct, index);
            }
            else{
                index++;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }
    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
