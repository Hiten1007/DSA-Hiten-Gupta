package StacksandQueues;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Cannot add element when stack is full!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot remove element when stack is empty!!");
        }
        return data[ptr--];
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty stack");
        }
        return data[ptr];
    }

    public boolean isFull(){
        return ptr == data.length - 1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }
}
