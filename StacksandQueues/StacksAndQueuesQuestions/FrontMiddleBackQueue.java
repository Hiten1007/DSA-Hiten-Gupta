package StacksandQueues.StacksAndQueuesQuestions;

public class FrontMiddleBackQueue {int[] data;
    int front = 2000;
    int middle = 2000;
    int rear = 2000;
    private static final int DEFAULT_SIZE = 4000;
    int size = 0;

    public FrontMiddleBackQueue() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void pushFront(int val) {
        data[--front] = val;
        size++;
        updateMiddle();
    }

    public void pushMiddle(int val) {
        if (size == 0) {
            pushFront(val);
            return;
        }
        if (size % 2 == 0) {
            middle++;
        }
        for (int i = rear; i > middle; i--) {
            data[i] = data[i - 1];
        }
        data[middle] = val;
        size++;
        rear++;
    }

    public void pushBack(int val) {
        data[rear++] = val;
        size++;
        updateMiddle();
    }

    public int popFront() {
        if (isEmpty()) {
            return -1;
        }
        int removed = data[front++];
        size--;
        updateMiddle();
        return removed;
    }

    public int popMiddle() {
        if (isEmpty()) {
            return -1;
        }

        int removed = data[middle];
        for (int i = middle; i < rear - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        rear--;

        if (size % 2 == 0) {
            middle--;
        }

        updateMiddle();
        return removed;
    }

    public int popBack() {
        if (isEmpty()) {
            return -1;
        }
        int removed = data[--rear];
        size--;
        updateMiddle();
        return removed;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void updateMiddle() {
        middle = front + (size - 1) / 2;
    }


    public void display(){
        if(isEmpty()) return;
        for(int i = front; i < rear; i++){
            System.out.print(data[i] + " ");
        }
    }

    public static void main(String[] args) {
        FrontMiddleBackQueue queue = new FrontMiddleBackQueue();
        queue.pushFront(23);
        queue.pushBack(12);
        System.out.println(queue.popMiddle());
        queue.display();

    }
}
