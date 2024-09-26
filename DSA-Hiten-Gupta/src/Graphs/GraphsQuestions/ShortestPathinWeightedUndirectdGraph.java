package Graphs.GraphsQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class ShortestPathinWeightedUndirectdGraph {
    class Pair{
        int w;
        int v;
        public Pair(int w, int v){
            this.w = w;
            this.v = v;
        }
    }
    public List<Integer> shortestPath(int n, int m, int edges[][]) {
        int[] dis = new int[n + 1];
        Arrays.fill(dis, Integer.MAX_VALUE);

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i = 0; i < n + 1; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < edges.length; i++){
            adj.get(edges[i][0]).add(new Pair(edges[i][2], edges[i][1]));
            adj.get(edges[i][1]).add(new Pair(edges[i][2], edges[i][0]));
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.w - y.w);

        int[] parent = new int[n + 1];
        for(int i = 0; i < parent.length; i++){
            parent[i] = i;
        }
        dis[1] = 0;

        pq.add(new Pair(0, 1));
        while(!pq.isEmpty()){
            int u = pq.remove().v;
            for(Pair it : adj.get(u)){
                int v = it.v;
                int w = it.w;
                if(dis[v] > dis[u] + w){
                    dis[v] = dis[u] + w;
                    parent[v] = u;
                    pq.add(new Pair(dis[v], v));
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();

        if(dis[n] == Integer.MAX_VALUE){
            ans.add(-1);
            return ans;
        }
        int i = n;
        while(parent[i] != i){
            ans.add(0, i);
            i = parent[i];
        }
        ans.add(0, parent[i]);
        ans.add(0, dis[n]);

        return ans;
    }
}
