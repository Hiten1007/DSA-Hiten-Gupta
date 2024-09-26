package Trees.TreesQuestions;

public class LongestUnivaluePath {
    int max = 0;
    public int longestUnivaluePath(TreeNode root) {
        postOrder(root);
        return max;
    }
    int postOrder(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = postOrder(root.left);
        int right = postOrder(root.right);

        int leftp = 0;
        int rightp = 0;
        if(root.left != null && root.val == root.left.val){
            leftp = left + 1;
        }
        if(root.right != null && root.val == root.right.val){
            rightp = right + 1;
        }
        max = Math.max(max, leftp + rightp);
        return Math.max(leftp ,rightp);
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
