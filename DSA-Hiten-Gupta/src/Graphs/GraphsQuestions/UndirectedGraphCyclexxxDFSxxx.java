package Graphs.GraphsQuestions;

import java.util.ArrayList;
public class UndirectedGraphCyclexxxDFSxxx {
    class Pair{
        int first;
        int second;
        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V];
        for(int i = 0; i < V; i++){
            if(!vis[i]){
                if(detectCycle(i, - 1, adj, vis)){
                 return true;
                }
            }
        }
        return false;
    }
    public boolean detectCycle(int node, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] vis){
        vis[node] = true;

        for(Integer it : adj.get(node)){
            if(!vis[it]){
                vis[it] = true;
                if(detectCycle(it, parent, adj, vis)){
                    return true;
                }
            }
            else if(parent != it){
                return true;
            }
        }
        return false;
    }
}
