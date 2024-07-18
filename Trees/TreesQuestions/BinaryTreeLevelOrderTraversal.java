package Trees.TreesQuestions;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list =  new ArrayList<>();

        if(root == null){
            return list;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){

            int levelSize = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < levelSize; i++){
                TreeNode x = q.poll();
                temp.add(x.val);
                if(x.left != null){
                    q.offer(x.left);
                }
                if(x.right != null){
                    q.offer(x.right);
                }
            }
            list.add(temp);
        }
        return list;
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
