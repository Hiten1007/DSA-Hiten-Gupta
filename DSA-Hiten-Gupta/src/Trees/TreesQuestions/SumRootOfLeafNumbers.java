package Trees.TreesQuestions;

public class SumRootOfLeafNumbers {
    public int sumNumbers(TreeNode root) {
        helper(root, 0);
        return sum;
    }
    int sum = 0;
    public void helper(TreeNode root, int curr){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            curr = curr*10 + root.val;
            sum += curr;
            return;
        }
        curr = curr * 10 + root.val;

        helper(root.left, curr);
        helper(root.right, curr);
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
