package Trees.TreesQuestions;

public class CousinsInBinaryTree {
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);

        return (level(root, xx, 0) == level(root, yy, 0)) && (!isSiblings(root, xx, yy));
    }

    static TreeNode findNode(TreeNode node, int z){
        if(node == null){
            return null;
        }
        if(node.val == z){
            return node;
        }

        TreeNode l = findNode(node.left, z);
        if(l != null){
            return l;
        }
        return findNode(node.right, z);
    }

    static boolean isSiblings(TreeNode node, TreeNode x, TreeNode y){
        if(node == null){
            return false;
        }

        return ((node.left == x && node.right == y )|| (node.left == y && node.right == x ) || isSiblings(node.left, x, y) || isSiblings(node.right, x, y));
    }

    static int level(TreeNode node, TreeNode z, int l){
        if(node == null){
            return 0;
        }
        if(node == z){
            return l;
        }

        int lev = level(node.left, z, l + 1);

        if(lev != 0){
            return lev;
        }
        return level(node.right, z, l + 1);
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
