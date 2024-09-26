package bitwise.bitwiseQuestions;

public class longestsubarraywithmaximumbitwiseand {
    public static void main(String[] args) {
        int[] arr = {395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,395808,470030,470030,470030,470030,470030,470030,470030,470030,470030,470030,470030,470030,470030,470030,470030,470030,470030,470030,470030,470030,470030,470030,470030,470030,153490,330001,330001,330001,330001,330001,330001,330001,37284,470030,470030,470030,470030,470030,470030,156542,226743};
        System.out.println(longestSubarray(arr));
    }
    static int longestSubarray(int[] nums) {
        int max = 0;
        int length = 0;
        int maxlength = 0;
        int mi = 0;
        for(int i = 0; i < nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
                mi = i;
            }
        }
        for(int i = mi; i < nums.length; i++){
            if(nums[i] == max){
                length += 1;
            }
            else{
                maxlength = Math.max(maxlength, length);
                length = 0;
            }
        }
        maxlength = Math.max(maxlength, length);

        if(maxlength == 0){
            return 1;
        }
        return maxlength;
    }
}
