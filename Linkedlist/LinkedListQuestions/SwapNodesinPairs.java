package Linkedlist.LinkedListQuestions;

public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head.next;
        head.next = head.next.next;
        temp.next = head;
        head = temp;
        ListNode prev = temp.next;
        ListNode t = temp.next.next;
        while(t != null && t.next != null){
            temp = t.next;
            t.next = t.next.next;
            prev.next = temp;
            temp.next = t;
            prev = t;
            t = t.next;
        }
        return head;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {

        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }
}
