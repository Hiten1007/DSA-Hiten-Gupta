package Graphs.GraphsQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class FindEventualSafeStates {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int[] vis = new int[graph.length];
        int[] pathVis = new int[graph.length];

        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int i = 0; i < graph.length; i++){
            if(vis[i] == 0){
                if(dfs(i, vis, pathVis, graph, q)){
                    q.add(i);
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(!q.isEmpty()){
            list.add(q.remove());
        }
        return list;
    }
    static boolean dfs(int i, int[] vis, int[] pathVis, int[][] graph, PriorityQueue<Integer> q){
        vis[i] = 1;
        pathVis[i] = 1;
        for(int it : graph[i]){
            if(vis[it] == 0){
                if(!dfs(it, vis, pathVis, graph, q)){
                    return false;
                }
                else{
                    q.add(it);
                }
            }
            else if(pathVis[it] == 1){
                return false;
            }
        }
        pathVis[i] = 0;
        return true;
    }
}
