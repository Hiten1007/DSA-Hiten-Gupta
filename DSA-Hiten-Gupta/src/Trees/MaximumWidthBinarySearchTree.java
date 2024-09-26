package Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumWidthBinarySearchTree {
    class Pair{
        int num;
        TreeNode node;
        public Pair(TreeNode node, int num){
            this.node = node;
            this.num = num;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int ans = 0;
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0));
        while(!q.isEmpty()){
            int minn = q.peek().num;
            int levelSize = q.size();
            int first = 0;
            int last = 0;
            for(int i = 0; i < levelSize; i++){
                int curr = q.peek().num - minn;
                TreeNode node = q.peek().node;
                q.poll();
                if(i == 0){
                    first = curr;
                }
                if(last == levelSize - 1){
                    last = curr;
                }
                if(node.left != null){
                    q.add(new Pair(node.left, curr*2 + 1));
                }
                if(node.right != null){
                    q.add(new Pair(node.right, curr * 2 + 2));
                }
            }
            ans = Math.max(ans, last - first + 1);
        }
        return ans;
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
