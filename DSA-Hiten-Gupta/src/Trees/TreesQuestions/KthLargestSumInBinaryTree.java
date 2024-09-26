package Trees.TreesQuestions;

import java.util.*;

public class KthLargestSumInBinaryTree {
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        PriorityQueue<Long> sum = new PriorityQueue<>();
        while(!q.isEmpty()){
            int levelSize = q.size();
            long levelSum = 0;
            for(int i = 0; i < levelSize; i++){
                TreeNode node = q.poll();
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
                levelSum += node.val;
            }
            if(sum.size() == k){
                if(sum.peek() < levelSum){
                    sum.poll();
                    sum.add(levelSum);
                }
            }else {
                sum.add(levelSum);
            }
        }
        return sum.size() < k ? -1 : sum.peek();
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
