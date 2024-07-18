package Trees.TreesQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SerializeAndDesrializeBinaryTree {
    public String serialize(TreeNode root) {
        StringBuilder s = new StringBuilder();
        helper(root, s);
        return s.toString();
    }
    public void helper(TreeNode root, StringBuilder s){
        if(root == null){
            s.append("null,");
            return;
        }
        s.append(String.valueOf(root.val + ","));

        helper(root.left, s);
        helper(root.right, s);
    }

    public TreeNode deserialize(String data) {
        String[] s = data.split(",");
        ArrayList<String> st = new ArrayList<>();
        st.addAll(Arrays.asList(s));
        Collections.reverse(st);
        TreeNode root = helperd(st);
        return root;
    }

    public TreeNode helperd(ArrayList<String> s){
        String l = s.remove(s.size() - 1);
        if(l.charAt(0) == 'n'){
            return null;
        }
        int val = Integer.parseInt(l);
        TreeNode root = new TreeNode(val);

        root.left = helperd(s);
        root.right = helperd(s);
        return root;
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
