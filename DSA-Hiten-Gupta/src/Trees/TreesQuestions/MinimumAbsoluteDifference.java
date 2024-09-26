package Trees.TreesQuestions;

public class MinimumAbsoluteDifference {
    private int minDiff;
    private TreeNode prev;
    public int getMinimumDifference(TreeNode root) {
        minDiff = Integer.MAX_VALUE;
        prev = null;
        inOrderTraversal(root);
        return minDiff;
    }

    private void inOrderTraversal(TreeNode node){
        if(node == null){
            return;
        }
        inOrderTraversal(node.left);

        if(prev != null){
            minDiff = Math.min(minDiff, Math.abs(prev.val - node.val));
        }

        prev = node;

        inOrderTraversal(node.right);
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
