package arrays;

public class Jumpgame {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(canJump(arr));
    }
    static boolean canJump(int[] nums) {
        int farthest = 0;
        for(int i = 0; i < nums.length; i++){
            if(i> farthest){
                return false;
            }
            farthest = Math.max(farthest, i + nums[i]);
            if(farthest >= nums.length - 1){
                return true;
            }
        }
        return false;
    }
}
