package Trees.TreesQuestions;

public class PathExistsInBinaryTreeFromRoottoLeaf {
    public boolean isExist(TreeNode node, int[] arr, int i){
        if(node == null){
            return false;
        }
        if(i >= arr.length || node.val != arr[i]){
            return false;
        }
        if(node.left == null && node.right == null && i == arr.length - 1){
            return true;
        }
        return isExist(node.left, arr, i + 1) || isExist(node, arr, i + 1);
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
