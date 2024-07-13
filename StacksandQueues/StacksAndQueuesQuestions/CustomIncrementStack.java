package StacksandQueues.StacksAndQueuesQuestions;

public class CustomIncrementStack {
    protected int[] data;
    private int s = -1;
    public CustomIncrementStack(int maxSize) {
        this.data = new int[maxSize];
    }

    public void push(int x) {
        if(s == data.length - 1){
            return;
        }
        data[++s] = x;
    }

    public int pop() {
        if(s == - 1){
            return -1;
        }
        return data[s--];
    }

    public void increment(int k, int val) {
        for(int i = 0; i < k && i <= s; i++){
            data[i] += val;
        }
    }
}
