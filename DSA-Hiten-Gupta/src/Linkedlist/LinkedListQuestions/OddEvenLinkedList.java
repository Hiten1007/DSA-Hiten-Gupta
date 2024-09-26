package Linkedlist.LinkedListQuestions;

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode dummy = new ListNode(0, head);
        ListNode odd = head;
        ListNode t = head.next;
        ListNode prev = new ListNode();
        while(odd != null && odd.next != null){
            ListNode temp = odd.next;
            if(odd.next.next == null){
                prev = odd;
            }
            odd.next = odd.next.next;
            odd = odd.next;
            if(temp.next != null){
                temp.next = temp.next.next;
            }
        }
        prev = (odd == null) ? prev : odd;
        prev.next = t;

        return dummy.next;
    }
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
