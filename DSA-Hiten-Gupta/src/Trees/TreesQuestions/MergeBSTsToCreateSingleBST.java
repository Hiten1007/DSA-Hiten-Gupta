package Trees.TreesQuestions;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MergeBSTsToCreateSingleBST {
    public TreeNode canMerge(List<TreeNode> trees) {
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(trees.removeFirst());
        for(int i = 1; i < trees.size(); i++) {
            TreeNode temp = trees.getFirst();
            List<TreeNode> list = new ArrayList<>();
            getLeaf(temp, list);
            for(int j = 0; j < list.size(); j++){
                if(nodes.contains(list.get(j))){
                    TreeNode temp2 = nodes.remove(nodes.indexOf(list.get(j)));
                    temp = merge(temp, temp2);
                    trees.remove(temp2);
                }

            }
            nodes.addLast(temp);
        }

        if(!trees.isEmpty() || nodes.size() != 1){
            return null;
        }

        if(!checkBST(nodes.getFirst())){
            return null;
        }

        return nodes.getFirst();
    }

    public TreeNode merge(TreeNode node1, TreeNode node2){
        if(node1 == null){
            return null;
        }
        if(node1 == node2){
            return node1.left == null && node1.right == null ? node2 : node1;
        }
        if(node1.left.val == node2.val){
            node1.left = node2;
            return node1;
        }
        if(node1.right.val == node2.val){
            node1.right = node2;
            return node1;
        }

        node1.left = merge(node1.left, node2);
        node1.right = merge(node1.right, node2);

        return node1;
    }

    public boolean checkBST(TreeNode node){
        if(node == null){
            return true;
        }

        boolean left = false;
        boolean right = false;

        if(node.val > node.left.val){
            left = checkBST(node.left);
        }
        if(node.val < node.right.val){
            right = checkBST(node.right);
        }

        return left && right;
    }

    public void getLeaf(TreeNode node, List<TreeNode> list){
        if(node == null){
            return;
        }
        if(node.left == null && node.right == null){
            list.add(node);
        }

        getLeaf(node.left, list);
        getLeaf(node.right, list);
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
