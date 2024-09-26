package Trees.TreesQuestions;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(root, targetSum, list, curr);
        return list;
    }
    public void helper(TreeNode root, int targetSum, List<List<Integer>> list, List<Integer> curr){
        if(root == null){
            return;
        }
        curr.add(root.val);
        if(root.left == null && root.right == null && targetSum == root.val) {
            list.add(new ArrayList<>(curr));
        }
        else {
            helper(root.left, targetSum - root.val, list, curr);

            helper(root.right, targetSum - root.val, list, curr);
        }
        curr.removeLast();

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
