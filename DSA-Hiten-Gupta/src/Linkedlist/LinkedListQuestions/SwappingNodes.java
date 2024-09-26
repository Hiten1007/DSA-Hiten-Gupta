package Linkedlist.LinkedListQuestions;

public class SwappingNodes {

    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode f = null;

        for(int i= 1; i < k; i++) fast = fast.next;
        f = fast;

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        int x = slow.val;
        slow.val = f.val;
        f.val = x;

        return head;
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
