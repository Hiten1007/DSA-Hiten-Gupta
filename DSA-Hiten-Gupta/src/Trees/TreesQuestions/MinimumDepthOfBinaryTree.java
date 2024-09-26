package Trees.TreesQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
//        if(root == null){
//            return 0;
//        }
//        if(root.left == null && root.right == null){
//            return 1;
//        }
//        if(root.left == null){
//            return minDepth(root.right) + 1;
//        }
//        if(root.right == null){
//            return minDepth(root.left) + 1;
//        }
//        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        int count = 0;
        if(root == null){
            return count;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelSize = q.size();
            count++;
            for(int i = 0; i < levelSize; i++){
                TreeNode temp = q.poll();
                if(temp.left == null && temp.right == null){
                    return count;
                }
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
        }
        return 1;
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
