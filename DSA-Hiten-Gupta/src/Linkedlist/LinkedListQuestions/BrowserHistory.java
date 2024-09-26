package Linkedlist.LinkedListQuestions;

public class BrowserHistory {
   private  Node head;
   private Node tail;
   private Node curr;

    public BrowserHistory(String homepage) {
        head = new Node(homepage);
        head.size = 1;
        tail = head;
        curr = head;
    }

    public void visit(String url) {
        Node temp = new Node(url);
        curr.next = temp;
        temp.size = curr.size + 1;
        temp.prev = curr;
        curr = curr.next;
        tail = curr;
    }

    public String back(int steps) {
        while(curr.prev != null && steps > 0){
            curr = curr.prev;
            steps--;
        }
        return curr.name;
    }

    public String forward(int steps) {

        while(curr.next != null && steps > 0){
            curr = curr.next;
            steps--;
        }
        return curr.name;
    }

    class Node{
        String name;
        Node prev;
        Node next;
        int size;
        public Node(String name){
            this.name = name;
        }
    }
}
