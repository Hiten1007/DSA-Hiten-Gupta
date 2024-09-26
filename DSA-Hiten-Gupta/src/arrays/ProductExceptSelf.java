package arrays;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 8};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    static int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        //prefix array
        int prefix = 1;
        for(int i = 0; i < nums.length; i++) {
            ans[i] = prefix;
            prefix  *= nums[i];
        }

        int postfix = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            ans[i] *=postfix;
            postfix *= nums[i];
        }
        return ans;
    }

}
