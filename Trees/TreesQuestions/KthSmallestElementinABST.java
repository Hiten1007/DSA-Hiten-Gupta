package Trees.TreesQuestions;

public class KthSmallestElementinABST {
    public int kthSmallest(TreeNode root, int k) {
        return kth(root, k).val;
    }
    int count = 0;
    public TreeNode kth(TreeNode root, int k) {
        if(root == null){
            return null;
        }
        TreeNode left = kth(root.left, k);
        if(left != null){
            return left;
        }

        count++;
        if(count == k){
            return root;
        }

        return kth(root.right, k);
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
