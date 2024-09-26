package Graphs;

import java.util.ArrayList;

public class DFS {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> list = new ArrayList<>();
        boolean[] vis = new boolean[V];

        dfs(0, adj, vis, list);

        return list;
    }

    public void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis, ArrayList<Integer> list){
        vis[node] = true;
        list.add(node);

        for(Integer num : adj.get(node)){
            if(!vis[num]){
                dfs(num, adj, vis, list);
            }
        }
    }
}
