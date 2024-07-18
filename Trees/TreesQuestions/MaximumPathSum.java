package Trees.TreesQuestions;

public class MaximumPathSum {
    public int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }
    int max = Integer.MIN_VALUE;
    public int helper(TreeNode root){
        if(root == null){
            return 0;
        }

        int left = helper(root.left);
        int right = helper(root.right);

        left = Math.max(left, 0);
        right = Math.max(right, 0);
        int dia = left + right + root.val;
        max = Math.max(max, dia);

        return Math.max(left, right) + root.val;
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
