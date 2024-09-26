package Trees.TreesQuestions;

public class PathSumIII {
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null){
            return 0;
        }
        return pathSumHelper(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }

    private static int pathSumHelper(TreeNode root, long target){
        if(root == null){
            return 0;
        }
        int res = 0;
        if(root.val == target){
            res += 1;
        }
        res += pathSumHelper(root.left, target - root.val);
        res += pathSumHelper(root.right, target - root.val);

        return (int)res;
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
