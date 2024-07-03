package Linkedlist.LinkedListQuestions;

public class DesignLinkedList {
    class MyLinkedList {
        Node head;
        Node tail;
        private int size;

        public MyLinkedList() {
            this.size = 0;
        }

        public int get(int index) {
            if(index >= size || index < 0){
                return - 1;
            }
            Node temp = head;

            while(index != 0){
                temp = temp.next;
                index--;
            }
            return temp.val;
        }

        public void addAtHead(int val) {
            Node temp = new Node(val, head);
            head = temp;
            if(size == 0){
                tail = head;
            }
            size++;
        }

        public void addAtTail(int val) {
            if(size == 0){
                addAtHead(val);
                return;
            }
            Node temp = new Node(val, null);
            tail.next = temp;
            tail = temp;
            size++;
        }

        public void addAtIndex(int index, int val) {

            if(index < 0 || index > size){
                return;
            }

            if(index == 0){
                addAtHead(val);
                return;
            }
            if(index == size){
                addAtTail(val);
                return;
            }
            Node temp = head;
            while(index != 1){
                temp = temp.next;
                index--;
            }
            temp.next = new Node(val, temp.next);
            size++;
        }

        public void deleteAtIndex(int index) {
            if(index < 0 || index >= size){
                return;
            }
            if(index == 0){
                deleteFirst();
                return;
            }

            if(index == size - 1){
                deleteLast();
                return;
            }
            Node temp = head;

            while(index != 1){
                temp = temp.next;
                index--;
            }
            temp.next = temp.next.next;
            size--;
        }

        public void deleteFirst(){
            if(size == 0){
                return;
            }
            head = head.next;
            size--;
            if(size == 0){
                tail = null;
            }
        }

        public void deleteLast(){
            if(size <= 1){
                deleteFirst();
                return;
            }
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            tail = temp;
            tail.next = null;
            size--;
        }

        class Node{
            int val;
            Node next;
            public Node(int val){
                this.val = val;
            }
            public Node(int val, Node next){
                this.val = val;
                this.next = next;
            }
        }
    }
}

