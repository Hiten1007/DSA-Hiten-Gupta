package Trees.TreesQuestions;

import com.sun.source.tree.Tree;

public class ConvertSortedArrayToBST {
    TreeNode root;
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortAdd(nums, 0, nums.length);
    }
    public TreeNode sortAdd(int[] arr, int start, int end){
        if(start >= end){
            return null;
        }
        int mid = start + (end - start)/2;
        TreeNode node = new TreeNode(arr[mid]);

        node.left = sortAdd(arr, start, mid);
        node.right = sortAdd(arr, mid + 1, end);

        return node;
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
