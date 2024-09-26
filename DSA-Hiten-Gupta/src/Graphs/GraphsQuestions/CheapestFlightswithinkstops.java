package Graphs.GraphsQuestions;

import java.util.*;

public class CheapestFlightswithinkstops {
    class Pair{
        int w;
        int v;
        public Pair(int w, int v){
            this.w = w;
            this.v = v;
        }
    }
    class Stop{
        int we;
        int u;
        int stops;
        public Stop(int we, int u, int stops){
            this.we = we;
            this.u = u;
            this.stops = stops;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] dis = new int[n];
        Arrays.fill(dis, Integer.MAX_VALUE);

        dis[src] = 0;

        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < flights.length; i++) {
            adj.get(flights[i][0]).add(new Pair(flights[i][2], flights[i][1]));
        }

        Queue<Stop> q = new LinkedList<>();

        q.add(new Stop(0, src, 0));

        while (!q.isEmpty()) {
            int u = q.peek().u;
            int we = q.peek().we;
            int stop = q.remove().stops;
            if(stop > k){
                continue;
            }

            for (Pair it : adj.get(u)) {
                int w = it.w;
                int v = it.v;
                if (dis[v] > we + w) {
                    dis[v] = we + w;

                    q.add(new Stop(dis[v], v, stop + 1));
                }
            }
        }
        return dis[dst] != Integer.MAX_VALUE ? dis[dst] : -1;
    }
}
