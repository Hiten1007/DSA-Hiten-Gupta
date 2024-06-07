package bitwise;

public class UniqueNumberintwiceDuplicateArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4, 3, 6, 4, 1, 5, 2};
        System.out.println(unique(arr));
    }
    static int unique(int[] nums){
        int ans = 0;
        for(int n : nums){
            ans ^= n;
        }
        return ans;
    }
}
