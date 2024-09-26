package Linkedlist.LinkedListQuestions;

public class ConvertBinaryNumberinaLinkedListtoInteger {
    public int getDecimalValue(ListNode head) {
        return (int)ListNode(head, size(head) - 1);
    }
    private double ListNode(ListNode node, int i){
        if(node.next == null){
            return node.val;
        }
        return  (ListNode(node.next, i - 1) + (node.val))*(Math.pow(2, i));
    }

    private int size(ListNode head){
        int size = 0;
        if(head == null){
            return 0;
        }
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        return size;
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
