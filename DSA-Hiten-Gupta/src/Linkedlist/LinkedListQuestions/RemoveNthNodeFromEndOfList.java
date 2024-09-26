package Linkedlist.LinkedListQuestions;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i = helper(head, 0 , n);
        if(i == n){
            if(head != null){
                head = head.next;
            }
        }
        System.out.println(i);
        return head;
    }
    static int helper(ListNode node, int i, int n){
        if(node == null){
            return 0;
        }
        i = 1 +  helper(node.next, i, n);
        if(i == n + 1){
            if(node.next != null){
                node.next = node.next.next;
            }
        }
        else{
            node.next = node.next;
        }
        return i;
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
    }
}
