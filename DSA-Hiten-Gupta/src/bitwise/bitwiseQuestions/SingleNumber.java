package bitwise.bitwiseQuestions;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {3, 1, 1, 4, 3, 5, 5, 6, 2, 2, 6};
        System.out.println(singleNumber(arr));
    }
    static int singleNumber(int[] nums) {
        int ans = nums[0];
        for(int i = 1; i < nums.length; i++){
            ans ^= nums[i];
        }
        return ans;
    }
}
