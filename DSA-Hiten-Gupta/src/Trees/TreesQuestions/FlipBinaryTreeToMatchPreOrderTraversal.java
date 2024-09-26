package Trees.TreesQuestions;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlipBinaryTreeToMatchPreOrderTraversal {
    int i = 0;
    List<Integer> ans;
    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        ans = new ArrayList<>();
        if(helper(root, voyage)){
            return ans;
        }

        return List.of(-1);
    }
    public boolean helper(TreeNode root, int[] voyage) {
        if (root == null) {
            return true;
        }
        if (root.val != voyage[i]) {
            return false;
        }
        i++;
        if(root.left != null && root.left.val != voyage[i]){
            ans.add(root.val);
            return helper(root.right, voyage) && helper(root.left, voyage);
        }

        return helper(root.left, voyage) && helper(root.right, voyage);
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
