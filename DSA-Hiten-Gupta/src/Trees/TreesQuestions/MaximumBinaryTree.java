package Trees.TreesQuestions;

import java.util.Arrays;

public class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }
    public TreeNode helper(int[] nums, int s, int e){
        if(s > e){
            return null;
        }
        int i = s;
        for(int j = s + 1; j <= e; j++){
            if(nums[i] < nums[j]){
                i = j;
            }
        }

        TreeNode root = new TreeNode(nums[i]);
        root.left = helper(nums, s, i - 1);
        root.right = helper(nums, i + 1, e);

        return root;
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
