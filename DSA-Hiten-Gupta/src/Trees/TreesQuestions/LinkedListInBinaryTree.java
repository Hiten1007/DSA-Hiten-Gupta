package Trees.TreesQuestions;

import Linkedlist.LinkedListQuestions.AddTwoNumbersII;

public class LinkedListInBinaryTree {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if(root == null){
            return false;
        }
        if(check(head, root)){
            return true;
        }

        boolean left = isSubPath(head, root.left);
        boolean right = isSubPath(head, root.right);

        return left || right;
    }
    public boolean check(ListNode head, TreeNode root){
        if(head == null){
            return true;
        }
        if(root == null){
            return false;
        }
        if(head.val != root.val){
            return false;
        }
        boolean left = false;
        boolean right = false;

        left = check(head.next, root.left);
        right = check(head.next, root.right);
        return left || right;
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
    class ListNode {
        int val;
        ListNode next;

        public ListNode(){

        }
        ListNode(int x) {
            val = x;
            next = null;
        }
        ListNode(int x, ListNode next) {
            val = x;
            next = null;
        }
    }
}
