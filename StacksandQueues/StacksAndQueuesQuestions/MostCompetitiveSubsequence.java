package StacksandQueues.StacksAndQueuesQuestions;

import java.util.Arrays;
import java.util.Stack;

public class MostCompetitiveSubsequence {
    public static void main(String[] args) {
        int[] nums = {3, 2, 6, 1, 5};
        System.out.println(Arrays.toString(mostCompetitive(nums, 3)));
    }
    static int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> st = new Stack();

        for(int i = 0; i < nums.length; i++){
            int val = nums[i];

            while(st.size() > 0 && nums[i] < st.peek() && nums.length - i > k - st.size()){
                st.pop();
            }
            if(st.size() < k){
                st.push(val);
            }
        }

        int[] ans = new int[k];
        int i = k - 1;

        while(!st.isEmpty()){
            ans[i] = st.pop();
            i--;
        }
        return ans;
    }
}
