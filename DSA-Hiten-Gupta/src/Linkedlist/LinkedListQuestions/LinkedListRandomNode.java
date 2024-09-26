package Linkedlist.LinkedListQuestions;

public class LinkedListRandomNode {
    ListNode head;
    int size;
    public LinkedListRandomNode(ListNode head) {
        head = new ListNode(head.val, head.next);
        size = getSize(head);
    }

    public int getRandom() {
        int random = (int)(Math.random() * size);
        ListNode temp = head;
        for(int i = 0; i < random; i++){
            if(temp.next != null) {
                temp = temp.next;
            }
            else{
                break;
            }
        }
        return temp.val;
    }

    public int getSize(ListNode head){
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        return size;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
