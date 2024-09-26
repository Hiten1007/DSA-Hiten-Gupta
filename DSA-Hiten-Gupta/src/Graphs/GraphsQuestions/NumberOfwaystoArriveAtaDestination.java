package Graphs.GraphsQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class NumberOfwaystoArriveAtaDestination {
    class Pair{
        long t;
        int v;
        public Pair(long t, int v){
            this.t = t;
            this.v = v;
        }
    }
    public int countPaths(int n, int[][] roads) {
        long[] dis = new long[n];
        Arrays.fill(dis, Long.MAX_VALUE);
        dis[0] = 0;

        int[] ways = new int[n];
        ways[0] = 1;
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for(int i = 0; i < n; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < roads.length; i++){
            adj.get(roads[i][0]).add(new Pair(roads[i][2], roads[i][1]));
            adj.get(roads[i][1]).add(new Pair(roads[i][2], roads[i][0]));
        }

        PriorityQueue<Pair> q = new PriorityQueue<>((x, y)-> Long.compare(x.t, y.t));
        q.add(new Pair(0, 0));
        int mod = (int)Math.pow(10, 9) + 7;

        while(!q.isEmpty()){
            int u = q.peek().v;
            long ct = q.remove().t;

            for(Pair it : adj.get(u)){
                int v = it.v;
                long t = it.t;
                if(dis[v] > t + ct){
                    dis[v] = t + ct;
                    q.add(new Pair(dis[v], v));
                    ways[v] = ways[u];
                } else if (dis[v] == t + ct) {
                    ways[v] = (ways[v] + ways[u])%mod;
                }
            }
        }
        return ways[n - 1] % mod;
    }
}
