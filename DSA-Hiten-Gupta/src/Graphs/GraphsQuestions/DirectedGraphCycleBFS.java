package Graphs.GraphsQuestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DirectedGraphCycleBFS {
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] indegree = new int[V];
        for(int i = 0; i < V; i++){
            for(Integer it : adj.get(i)){
                indegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        for(int i = 0; i < V; i++){
            if(indegree[i] == 0){
                q.add(i);
                count++;
            }
        }
        while(!q.isEmpty()){
            int i = q.remove();
            for(Integer it : adj.get(i)){
                indegree[it]--;
                if(indegree[it] == 0){
                    q.add(it);
                    count++;
                }
            }
        }
        return count == V;
    }
}
