package Linkedlist.LinkedListQuestions;

import Linkedlist.LL;

public class FlattenAmultiLevelDoublyLL {
    public Node flatten(Node head) {

        if(head == null){
            return head;
        }

        Node curr = head;

        while(curr != null){
            if(curr.child != null){
                Node next = curr.next;
                curr.child = flatten(curr.child);
                Node tail = curr.child;
                while(tail.next != null){
                    tail = tail.next;
                }

                if(curr.next != null) {
                    next.prev = tail;
                }
                tail.next = next;
                curr.next = curr.child;
                curr.next.prev = curr;
                curr.child = null;
            }
            curr = curr.next;
        }
        return head;
    }

    static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
        public Node(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {

    }
}
