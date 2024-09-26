package Trees.TreesQuestions;

import java.util.*;

public class VerticalOrderTraversal {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        PriorityQueue<Map.Entry<TreeNode, Integer>> queue = new PriorityQueue<>();
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        int min = 0;
        int max = 0;

        int col = 0;
        queue.offer(new AbstractMap.SimpleEntry<>(root, col));
        while(!queue.isEmpty()){
            Map.Entry<TreeNode, Integer> key = queue.poll();
            TreeNode node = key.getKey();
            col = key.getValue();
            if(node!= null){
                if(!map.containsKey(col)){
                    map.put(col, new ArrayList<>());
                }

                map.get(col).add(node.val);

                min = Math.min(min, col);
                max = Math.max(max, col);

                queue.offer(new AbstractMap.SimpleEntry<>(node.left, col - 1));
                queue.offer(new AbstractMap.SimpleEntry<>(node.right, col + 1));
            }
        }
        for(int i = min; i <= max; i++){
            ans.add(map.get(i));
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
