package Graphs.GraphsQuestions;

import java.util.*;


public class ShortestpathinDirectedAcyclicGraph {
    class Edge{
        int num;
        int weight;
        public Edge(int num, int weight){
            this.num = num;
            this.weight = weight;
        }
    }
    public int[] shortestPath(int N,int M, int[][] edges) {
        int[] vis = new int[N];
        int[] dis = new int[N];
        Arrays.fill(dis, Integer.MAX_VALUE);
        ArrayList<ArrayList<Edge>> adj = new ArrayList<>();

        for(int i = 0; i < N; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < edges.length; i++){
            adj.get(edges[i][0]).add(new Edge(edges[i][1], edges[i][2]));
        }
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < N; i++){
            if(vis[i] == 0){
                dfs(i, vis, adj, st);
            }
        }

        dis[0] = 0;

        while(!st.isEmpty()){
            int i = st.pop();

            if(dis[i] != Integer.MAX_VALUE) {
                for (Edge it : adj.get(i)) {
                    if (dis[it.num] > dis[i] + it.weight) {
                        dis[it.num] = dis[i] + it.weight;
                    }
                }
            }
        }

        for(int i = 0; i < dis.length; i++){
            if(dis[i] == Integer.MAX_VALUE){
                dis[i] = -1;
            }
        }
        return dis;
    }
    static void dfs(int i, int[] vis, ArrayList<ArrayList<Edge>> list, Stack<Integer> st){
        vis[i] = 1;

        for(Edge it : list.get(i)){
            if(vis[it.num] == 0){
                vis[it.num] = 1;
                dfs(it.num, vis, list, st);
            }
        }
        st.add(i);
    }
}
