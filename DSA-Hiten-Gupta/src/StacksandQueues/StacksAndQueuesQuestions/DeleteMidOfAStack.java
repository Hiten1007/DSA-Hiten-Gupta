package StacksandQueues.StacksAndQueuesQuestions;

import java.util.Stack;

public class DeleteMidOfAStack {
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        int size = sizeOfStack/2;
        Stack<Integer> st = new Stack<>();
        while(size > 0){
            st.push(s.pop());
            size--;
        }
        s.pop();
        while(!st.isEmpty()){
            s.push(st.pop());
        }
    }
}
