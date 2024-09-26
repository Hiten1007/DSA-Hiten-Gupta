package Graphs.GraphsQuestions;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj){
        int[] vis = new int[V];

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < V; i++){
            if(vis[i] == 0){
                dfs(i, vis, st, adj);
            }
        }
        for(int i = 0; i < V; i++){
            vis[i] = st.pop();
        }
        return vis;
    }
    static void dfs(int i, int[] vis, Stack<Integer> st, ArrayList<ArrayList<Integer>> adj){
        vis[i] = 1;

        for(Integer it : adj.get(i)){
            if(vis[it] == 0){
                dfs(it, vis, st, adj);
            }
        }
        st.push(i);
    }
}
