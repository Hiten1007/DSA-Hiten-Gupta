package StacksandQueues.StacksAndQueuesQuestions;

public class MyCircularQueue {
    protected int[] data;
    int front = 0;
    int rear = 0;
    int size = 0;
    private static final int DEFAULT_SIZE = 10;
    public MyCircularQueue() {
        this(DEFAULT_SIZE);
    }
    public MyCircularQueue(int k) {
        this.data = new int[k];
    }

    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        data[rear++] = value;
        rear = rear% data.length;
        size++;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        front++;
        front = front % data.length;
        size--;
        return true;
    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return data[front];
    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        if(rear == 0){
            return data[data.length - 1];
        }
        return data[rear - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }
}
