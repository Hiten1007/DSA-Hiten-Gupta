package Linkedlist.LinkedListQuestions;

public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        Node newHead = new Node(head.val);
        Node temp = newHead;

        Node temp2 = head;
        while(temp2.next != null){
            temp2 = temp2.next;
            temp.next = new Node(temp2.val);
            temp = temp.next;
        }
        temp.next = null;
        temp = newHead;

        temp2 = head;

        while(temp2 != null){
            if(temp2.random != null){
                temp.random = getNode(newHead, temp2.random);
            }
            temp2 = temp2.next;
            temp = temp.next;
        }

        return newHead;
    }
    public Node getNode(Node newHead, Node random){
        while(newHead != random){
            newHead = newHead.next;
        }
        return newHead;
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
