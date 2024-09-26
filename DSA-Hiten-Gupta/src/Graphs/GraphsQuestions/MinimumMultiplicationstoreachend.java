package Graphs.GraphsQuestions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MinimumMultiplicationstoreachend {
    class Pair{
        int steps;
        int v;
        public Pair(int steps, int v){
            this.steps = steps;
            this.v = v;
        }
    }
    int minimumMultiplications(int[] arr, int start, int end) {
        int[] dis = new int[99999];
        Arrays.fill(dis, Integer.MAX_VALUE);
        Queue<Pair> q = new LinkedList<>();

        int mod = 100000;
        dis[start] = 0;

        q.add(new Pair(0, start));

        while(!q.isEmpty()){
            int u = q.peek().v;
            int steps = q.peek().steps;

            if(u == end){
                return steps;
            }

            for(int i = 0; i < arr.length; i++){
                int v = (u * arr[i])%mod;
                if(dis[v] > steps + 1){
                    dis[v] = steps + 1;
                    q.add(new Pair(dis[v], v));
                }
            }
        }
        return -1;
    }
}
