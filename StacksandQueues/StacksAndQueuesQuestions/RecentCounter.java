package StacksandQueues.StacksAndQueuesQuestions;

import java.util.ArrayDeque;
import java.util.Queue;

public class RecentCounter {
    Queue<Integer> queue = new ArrayDeque<>();
    private int count = 0;
    public RecentCounter() {
        count = 0;
    }

    public int ping(int t) {
        while(!queue.isEmpty() && queue.peek() < t - 3000){
            queue.poll();
            count--;
        }
        queue.add(t);
        count++;

        return count;
    }

    public static void main(String[] args) {
        RecentCounter obj = new RecentCounter();
        obj.ping(3002);
        System.out.println(obj.count);
    }
}
