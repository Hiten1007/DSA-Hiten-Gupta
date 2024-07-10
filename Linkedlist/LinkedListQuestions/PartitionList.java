package Linkedlist.LinkedListQuestions;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode less = new ListNode(0);
        ListNode high = new ListNode(0);

        ListNode lesserHead = less;
        ListNode higherHead = high;

        while(head != null){
            if(head.val >= x){
                higherHead.next = head;
                higherHead = higherHead.next;
            }
            else{
                lesserHead.next = head;
                lesserHead = lesserHead.next;
            }
            head = head.next;
        }
        lesserHead.next = high.next;
        higherHead.next = null;

        return less.next;
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
