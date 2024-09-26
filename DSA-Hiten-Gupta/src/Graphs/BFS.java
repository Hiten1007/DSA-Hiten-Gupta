package Graphs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> list = new ArrayList<>();

        Queue<Integer> q = new LinkedList<>();

        boolean[] vis = new boolean[V];
        vis[0] = true;
        q.add(0);

        while(!q.isEmpty()){
            Integer x = q.poll();
            list.add(x);

            for(Integer y : adj.get(x)){
                if(!vis[y]){
                    q.add(y);
                    vis[y] = true;
                }
            }
        }

        return list;
    }
}
