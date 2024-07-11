package StacksandQueues.StacksAndQueuesQuestions;

import java.util.Stack;

public class MinStack {
    private int[] stack;
    private int[] minStack;
    private int top;
    private int minTop;
    public MinStack() {
        stack = new int[30000];
        minStack = new int[30000];
        top = -1;
        minTop = -1;
    }

    public void push(int val) {
        stack[++top] = val;
        if(minTop == -1 || minStack[minTop] >= val){
            minStack[++minTop] = val;
        }
    }
    public void pop() {
        if(top == -1){
            return;
        }
        if(minStack[minTop] == stack[top] ){
            minTop--;
        }
        top--;
    }

    public int top(){

        return stack[top];
    }

    public int getMin() {

        return minStack[minTop];
    }
}
