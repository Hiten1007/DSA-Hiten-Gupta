package bitwise.bitwiseQuestions;

public class UniqueElementinThriceDuplicateArray {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 31; i >= 0; i--){
            int sum = 0;
            for(int num : nums){
                int n = (num >> i);
                if((n&1) == 1){
                    sum++;
                }
            }
            sum = sum % 3;

            ans = ans << 1;

            if(sum != 0){
                ans += 1;
            }
        }
        return ans;
    }
}
