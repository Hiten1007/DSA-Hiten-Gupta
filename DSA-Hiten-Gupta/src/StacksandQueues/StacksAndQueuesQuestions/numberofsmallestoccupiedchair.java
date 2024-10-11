package StacksandQueues.StacksAndQueuesQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class numberofsmallestoccupiedchair {
    public int smallestChair(int[][] times, int targetFriend) {
        int n = times.length;
        List<int[]> arrivals = new ArrayList<>();

        for(int i = 0; i < n; i++){
            arrivals.add(new int[]{times[i][0], i});
        }
        arrivals.sort((a, b) -> Integer.compare(a[0], b[0]));

        PriorityQueue<Integer> availableChairs = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            availableChairs.add(i);
        }

        PriorityQueue<int[]> leavingqueue = new PriorityQueue<>((a, b)-> Integer.compare(a[0], b[0]));

        for(int[] arrival : arrivals){
            int arrive = arrival[0];
            int originalIndex = arrival[1];

            while(!leavingqueue.isEmpty() && leavingqueue.peek()[0] <= arrive){
                availableChairs.add(leavingqueue.poll()[1]);
            }

            int chair = availableChairs.poll();

            if(originalIndex == targetFriend){
                return chair;
            }

            leavingqueue.add(new int[]{times[originalIndex][1], chair});
        }
        return -1;
    }
}
