package Trees.TreesQuestions;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }

        return Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    public int getHeight(TreeNode node){
        if(node == null){
            return 0;
        }

        return Math.max(getHeight(node.left),getHeight( node.right)) + 1;
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
