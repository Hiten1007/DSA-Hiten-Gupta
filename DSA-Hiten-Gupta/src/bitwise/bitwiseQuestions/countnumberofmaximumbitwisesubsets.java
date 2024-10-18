package bitwise.bitwiseQuestions;

public class countnumberofmaximumbitwisesubsets {
    public void backtrack(int[] nums, int index, int currentOr, int maxOr, int[] count){
        if(maxOr == currentOr){
            count[0]++;
        }
        for(int i = index; i < nums.length; i++){
            backtrack(nums, i + 1, currentOr | nums[i], maxOr, count);
        }
    }
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0;
        for(int i = 0; i < nums.length; i++){
            maxOr |= nums[i];
        }

        int[] count = new int[1];

        backtrack(nums, 0, 0, maxOr, count);

        return count[0];
    }
}
