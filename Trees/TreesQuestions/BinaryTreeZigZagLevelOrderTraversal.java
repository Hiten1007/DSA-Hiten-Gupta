package Trees.TreesQuestions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeZigZagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        boolean flag = true;

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < levelSize; i++){
                TreeNode x = flag ? queue.pollFirst() : queue.pollLast();
                temp.add(x.val);
                if(flag){
                    if(x.left != null){
                        queue.addLast(x.left);
                    }
                    if(x.right != null){
                        queue.addLast(x.right);
                    }
                }
                else{
                    if(x.right != null){
                        queue.addFirst(x.right);
                    }
                    if(x.left != null){
                        queue.addFirst(x.left);
                    }
                }
            }
            flag = !flag;
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
