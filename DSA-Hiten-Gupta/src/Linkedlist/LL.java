package Linkedlist;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(tail==null){
            insertFirst(val);
            return;
        }
        tail.next = node;
        tail = node;
        size += 1;

    }

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size - 1){
            return deleteLast();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, --index, node.next);
        return node;
    }


    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public Node get(int index){
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
    }

    private class Node{

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public void deleteDuplicates(){
        Node node = head;
        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }
            else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public static LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while(f != null && s != null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }
            else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while(f!=null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while(s!= null){
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }

    public void bubbleSort(){
        bubbleSort(size - 1, 0);
    }
    private void bubbleSort(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            Node f = get(c);
            Node s = get(c + 1);
            if(f.value > s.value){
                if(f == head){
                    head = s;
                    f.next = s.next;
                    s.next = f;
                }
                else if(s.next == null){
                    Node prev = get(c - 1);
                    prev.next = s;
                    tail = f;
                    f.next = null;
                    s.next = tail;
                }
                else{
                    Node prev = get(c - 1);
                    prev.next = s;
                    f.next = s.next;
                    s.next  = f;
                }
            }
            bubbleSort(r, c + 1);
        }else{
            bubbleSort(r - 1, 0);
        }
    }

    private void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverse(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void reverse2(){
        if(size  < 2){
            return;
        }
        Node prev = null;
        Node pres = head;
        Node next = head.next;

        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null) {
                next = next.next;
            }
        }
        head = prev;
    }

    public static void main(String[] args) {
        LL first = new LL();
        LL second = new LL();

        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);
        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

//        LL ans = merge(first, second);
//        ans.display();

        LL ans = new LL();
        for(int i = 7; i > 0; i--){
            ans.insertLast(i);
        }
        ans.display();
        ans.bubbleSort();
        ans.display();
    }
}
