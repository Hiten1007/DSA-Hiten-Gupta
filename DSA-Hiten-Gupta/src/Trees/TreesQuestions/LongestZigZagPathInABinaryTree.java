package Trees.TreesQuestions;

public class LongestZigZagPathInABinaryTree {
    private int ans;
    public int longestZigZag(TreeNode root) {
        check(root, 0, 0);
        return ans;
    }
    void check(TreeNode node, int l, int r){
        if(node == null){
            return;
        }
        ans = Math.max(ans, Math.max(l, r));
        check(node.left, r + 1, 0);
        check(node.right, 0, l + 1);
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
