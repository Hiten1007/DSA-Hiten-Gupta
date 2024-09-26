package Graphs.GraphsQuestions;

import java.util.ArrayList;

public class DirectedGraphCycleDfs {

    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
       boolean[] vis = new boolean[V];
       boolean[] pathVis = new boolean[V];

       for(int i = 0; i < V; i++){
           if(!vis[i]){
               if(dfs(i, vis, pathVis, adj)){
                return true;
               }
           }
       }
       return false;
    }
    static boolean dfs(int i, boolean[] vis, boolean[] pathVis, ArrayList<ArrayList<Integer>> adj){
        vis[i] = true;
        pathVis[i] = true;

        for(Integer it : adj.get(i)){
            if(!vis[it]){
                if(dfs(it, vis, pathVis, adj)) {
                    return true;
                }
            }
            else if(pathVis[i]){
                return true;
            }
        }
        pathVis[i] = false;
        return false;
    }
}
