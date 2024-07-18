package Trees.TreesQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderSuccessorOfANode {
    public TreeNode successor(TreeNode root, int key){


        if(root == null){
            return null;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){

               TreeNode x = q.poll();

                if(x.left != null){
                    q.offer(x.left);
                }
                if(x.right != null){
                    q.offer(x.right);
                }
                if(x.val == key){
                    break;
                }
            }

        return q.peek();
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
