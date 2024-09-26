package Trees.TreesQuestions;

public class StepByStepPath {
    public String getDirections(TreeNode root, int startValue, int destValue) {
        TreeNode ancestor = ancestor(root, startValue, destValue);
        int depthOfStart = depth(ancestor, startValue);
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < depthOfStart; i++) {
            res.append("U");
        }
        StringBuilder x = new StringBuilder();
        getLeftAndRight(ancestor, destValue, x);
        res.append(x);
        return res.toString();
    }
    public boolean getLeftAndRight(TreeNode node, int destValue, StringBuilder p){
        if(node == null){
            return false;
        }
        if(node.val == destValue){
            return true;
        }
        p.append("L");
        if(getLeftAndRight(node.left, destValue, p)){
            return true;
        }
        p.deleteCharAt(p.length() - 1);
        p.append("R");
       if(getLeftAndRight(node.right, destValue, p)){
           return true;
        }
        p.deleteCharAt(p.length() - 1);
        return false;
    }

    public int depth(TreeNode ancestor, int startValue){
        if(ancestor == null) {
            return -1;
        }
        if(ancestor.val == startValue){
            return 0;
        }
        int left = depth(ancestor.left, startValue);
        int right = depth(ancestor.right, startValue);

        if(left == -1 && right == -1){
            return -1;
        }
        if(left == -1){
            return 1 + right;
        }
        if(right == -1){
            return 1 + left;
        }

        return 1+ Math.min(left, right);
    }
    public TreeNode ancestor(TreeNode root, int startValue, int destValue){
        if(root == null){
            return null;
        }
        if(root.val == startValue || root.val == destValue){
            return root;
        }
        TreeNode left = ancestor(root.left, startValue, destValue);
        TreeNode right = ancestor(root.right, startValue, destValue);

        if(left != null && right != null){
            return root;
        }
        if(left != null){
            return left;
        }
        if(right != null){
            return right;
        }
        return null;
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
