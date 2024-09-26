package StacksandQueues.StacksAndQueuesQuestions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKelementsofQueue {
    static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        Stack<Integer> st = new Stack<>();

        while(k > 0){
            st.push(q.poll());
            k--;
        }
        int size = q.size();

        while(!st.isEmpty()){
            q.add(st.pop());
        }

        while(size > 0){
            q.add(q.poll());
            size--;
        }

        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        int k = 4;
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);
        q.add(5);
        q.add(6);
        System.out.println(modifyQueue(q, k));
    }
}
