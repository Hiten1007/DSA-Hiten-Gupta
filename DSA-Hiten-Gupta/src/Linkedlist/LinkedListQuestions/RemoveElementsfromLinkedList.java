package Linkedlist.LinkedListQuestions;

public class RemoveElementsfromLinkedList {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }

        while(head.next != null && head.val == val){
            head = head.next;
        }

        if(head.val == val && head.next == null){
            return null;
        }

        ListNode temp = head;

        while(temp.next != null){
            if(temp.next.val == val){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
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
