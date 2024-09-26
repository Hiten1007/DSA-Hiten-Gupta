package Graphs.GraphsQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathinUndirectedGraph {
    class Pair{
        int num;
        int weight;
        public Pair(int num, int weight){
            this.num = num;
            this.weight = weight;
        }
    }
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        int[] vis = new int[n];

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < n; i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0; i < edges.length; i++){
            list.get(edges[i][0]).add(edges[i][1]);
            list.get(edges[i][1]).add(edges[i][0]);
        }

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src, 0));
        vis[src] = 1;

        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        ans[src] = 0;
        while(!q.isEmpty()){
            int i = q.peek().num;
            int weight = q.peek().weight;
            q.remove();

            for(Integer it : list.get(i)){
                if(vis[it] == 0){
                    vis[it] = 1;
                    q.add(new Pair(it, weight + 1));
                    ans[it] = weight + 1;
                }
            }
        }
        return ans;
    }
}
