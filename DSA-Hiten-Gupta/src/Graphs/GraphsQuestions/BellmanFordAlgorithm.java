package Graphs.GraphsQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class BellmanFordAlgorithm {
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S) {
        int[] dis = new int[V];
        Arrays.fill(dis,100000000);

        dis[S] = 0;

        for(int i = 0; i < V - 1; i++){
            for(ArrayList<Integer> list: edges){
                int u = list.get(0);
                int v = list.get(1);
                int w = list.get(2);
                if(dis[u] + w < dis[v]){
                    dis[v] = dis[u] + w;
                }
            }
        }
        for(ArrayList<Integer> list : edges){
            int u = list.get(0);
            int v = list.get(1);
            int w = list.get(2);
            if(dis[u] + w < dis[v]){
                return new int[] {-1};
            }
        }

        return dis;
    }
}
