package Trees.TreesQuestions;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        List<Integer> left = inorderTraversal(root.left);
        list.addAll(left);
        list.add(root.val);
        List<Integer> right = inorderTraversal(root.right);
        list.addAll(right);

        return list;
    }
    class TreeNode{
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
