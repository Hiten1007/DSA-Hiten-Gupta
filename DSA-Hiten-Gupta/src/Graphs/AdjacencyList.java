package Graphs;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {
    public List<List<Integer>> printGraph(int V, int[][] edges) {
        List<List<Integer>> list = new ArrayList<>(V);

        for(int i = 0; i < V; i++){
            list.add(new ArrayList<>());
        }

        for(int[] arr : edges){
            list.get(arr[0]).add(arr[1]);
            list.get(arr[1]).add(arr[0]);
        }
        return list;
    }
}
