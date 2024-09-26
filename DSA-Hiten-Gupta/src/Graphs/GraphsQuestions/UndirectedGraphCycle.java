package Graphs.GraphsQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class UndirectedGraphCycle {
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
                if(detectCycle(i, adj, vis)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean detectCycle(int src, ArrayList<ArrayList<Integer>> adj, boolean[] vis){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src, -1));

        while(!q.isEmpty()){
            int node = q.peek().first;
            int parent = q.peek().second;
            for(Integer it : adj.get(node)){
                if(!vis[it]){
                    vis[it] = true;
                    q.add(new Pair(it, node));
                }
                //an already visited node would have to be its parent if there is no loop
                else if(parent != it){
                    return true;
                }
            }
        }
        return false;
    }
}
