package Graphs.GraphsQuestions;

import java.util.List;
import java.util.PriorityQueue;

public class PrimsAlgorithm {
    static class Pair{
        int w;
        int n;
        int p;
        public Pair(int w, int n, int p){
            this.w = w;
            this.n = n;
            this.p = p;
        }
    }
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        int[] vis = new int[V];

        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y)-> x.w - y.w);

        pq.add(new Pair(0, 0, -1));
        int sum = 0;
        while(!pq.isEmpty()){
            int w = pq.peek().w;
            int n = pq.peek().n;
            int p = pq.remove().p;

            if(vis[n] == 1) continue;

            vis[n] = 1;
            sum += w;

            for(int[] arr : adj.get(n)){
                int v = arr[0];
                int cw = arr[1];
                if(vis[v] == 0){
                    pq.add(new Pair(cw, v, n));
                }
            }
        }
        return sum;
    }
}
