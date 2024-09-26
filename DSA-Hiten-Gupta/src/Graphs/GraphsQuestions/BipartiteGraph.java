package Graphs.GraphsQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {
    public static void main(String[] args) {
        int[][] graph = {{1,3},{0,2},{1,3},{0,2}};
        System.out.println(isBipartite(graph));
    }
    static boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n];
       for(int i = 0; i < n; i++){
           if(colors[i] == 0){
               if(!bfs(i, graph, colors)){
                   return false;
               }
           }
       }
       return true;
    }
    static boolean bfs(int i, int[][] graph, int[] colors){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        colors[i] = 1;
        while(!q.isEmpty()){
            int j = q.remove();
           for(int k = 0; k < graph[j].length; k++){
               if(colors[graph[j][k]] == 0){
                   colors[graph[j][k]] = colors[j] == 2 ? 1 : 2;
                   q.add(graph[j][k]);
               }
               else if((colors[j] == 1 && colors[graph[j][k]] == 1) || (colors[j]== 2 && colors[graph[j][k]] == 2)){
                return false;
               }
           }
        }
        return true;
    }
}
