package Trees.TreesQuestions;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }
    public boolean helper(TreeNode node, Integer lo, Integer hi){
        if(node == null){
            return true;
        }
        if(lo != null && node.val <= lo){
            return false;
        }
        if(hi != null && node.val >= hi){
            return false;
        }
        return helper(node.left, lo, node.val) && helper(node.right, node.val, hi);
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
