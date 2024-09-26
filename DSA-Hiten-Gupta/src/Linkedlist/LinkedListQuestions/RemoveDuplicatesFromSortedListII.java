package Linkedlist.LinkedListQuestions;

public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode d = dummy;
        while(d != null){
            ListNode temp = d.next;
            int curr = temp.val;
            while(temp != null && temp.val == curr){
                temp = temp.next;
                if(temp.next != null && temp.next.val != curr){
                    d.next = temp;
                }
            }
            d = temp;
        }
        return dummy.next;
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
