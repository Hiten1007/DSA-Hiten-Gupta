package Graphs.GraphsQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class NetworkDelayTime {
    class Pair{
        int t;
        int v;
        public Pair(int t, int v){
            this.t = t;
            this.v = v;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] time = new int[n + 1];
        Arrays.fill(time, Integer.MAX_VALUE);
        time[k] = 0;

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for(int i = 0; i < n + 1; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < times.length; i++){
            adj.get(times[i][0]).add(new Pair(times[i][2], times[i][1]));
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y)->x.t - y.t);

        pq.add(new Pair(0, k));

        while(!pq.isEmpty()){
            int u = pq.remove().v;

            for(Pair it : adj.get(u)){
                int v = it.v;
                int t = it.t;
                if(time[v] > time[u] + t){
                    time[v] = time[u] + t;
                    pq.add(new Pair(time[v], v));
                }
            }
        }
        int minTime = 0;
        for(int i = 1; i < time.length; i++){
            if(time[i] == Integer.MAX_VALUE){
                return -1;
            }
            else{
                if(minTime < time[i]){
                    minTime = time[i];
                }
            }
        }
        return minTime;
    }
}
