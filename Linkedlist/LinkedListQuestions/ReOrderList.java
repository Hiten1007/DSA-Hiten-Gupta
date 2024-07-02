package Linkedlist.LinkedListQuestions;

public class ReOrderList {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode mid = middleNode(head);
        ListNode hs = reverseList(mid);
        ListNode hf = head;


        while(hf != null && hs != null){
            ListNode temp = head.next;
            hf.next = hs;
            hf = temp;
            temp = hs.next;
            hs.next = hf;
            hs = temp;

        }
        if (hf != null){
            hf.next = null;
        }
    }
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode pres = head;
        ListNode nexts = (pres != null) ? pres.next : null;

        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = nexts;
            if(nexts != null) {
                nexts = nexts.next;
            }
        }
        head = prev;
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
