package Trees.TreesQuestions;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        StringBuilder sb= new StringBuilder();

        binaryTreePathsUtil(root,res,sb);
        return res;
    }

    public void binaryTreePathsUtil(TreeNode root,List<String> res,StringBuilder sb){
        if(root==null)
            return;
        sb.append(root.val);
        if(root.left==null && root.right==null)
            res.add(sb.toString());
        binaryTreePathsUtil(root.left,res,sb.append("->"));

        binaryTreePathsUtil(root.right,res,sb);
        sb.delete(sb.length()-String.valueOf(root.val).length()-2,sb.length());

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
