package Graphs.GraphsQuestions;

import java.util.*;

public class DijkstrasAlgorithm {
    class Edge{
        int v;
        int w;
        public Edge(int v, int w){
            this.v = v;
            this.w = w;
        }
    }
    public int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S){
        int[] dis = new int[V];

        Arrays.fill(dis, Integer.MAX_VALUE);

        dis[S] = 0;

        PriorityQueue<Edge> q = new PriorityQueue<>((x, y) -> x.w - y.w);

        q.add(new Edge(S, 0));

        while(!q.isEmpty()){
            int u = q.peek().v;
            int pW = q.peek().w;

            q.remove();

            for (ArrayList<Integer> list : adj.get(u)) {
                int v = list.get(0);
                int w = list.get(1);
                if (dis[v] > pW + w) {
                    dis[v] = pW + w;
                    q.add(new Edge(v, dis[v]));
                }
            }
        }
        return dis;
    }
}
