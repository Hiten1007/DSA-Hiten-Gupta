package StacksandQueues.StacksAndQueuesQuestions;

public class DesignCircularDeque {
    Node front;
    Node rear;
    int size;
    int max;
    public DesignCircularDeque(int k) {
        size = 0;
        max = k;
        front = null;
        rear = null;
    }

    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        Node newNode = new Node(value);
        if (front == null && rear == null) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        Node newNode = new Node(value);
        if (front == null && rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            front.prev = null;
        }
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        if (front == rear) {
            front = rear = null;
        } else {
            rear = rear.prev;
            rear.next = null;
        }
        size--;
        return true;
    }

    public int getFront() {
        if(isEmpty()){
            return -1;
        }
        return front.val;
    }

    public int getRear() {
        if(isEmpty()){
            return -1;
        }
        return rear.val;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }
    class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val){
            this.val = val;
        }
    }
}
