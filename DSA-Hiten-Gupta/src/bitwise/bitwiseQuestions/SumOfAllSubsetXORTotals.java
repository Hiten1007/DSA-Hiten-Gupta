package bitwise.bitwiseQuestions;

public class SumOfAllSubsetXORTotals {
    public static void main(String[] args) {
        int[] arr= {5, 1, 6};
        System.out.println(subsetXORSum(arr));
    }
    static int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }
    static int helper(int[] nums, int index, int curval){
        if(index == nums.length){
            return curval;
        }
        return helper(nums, index + 1, curval ^ nums[index]) + helper(nums, index + 1, curval);
    }
}
