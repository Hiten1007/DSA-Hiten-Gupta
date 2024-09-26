package Graphs.GraphsQuestions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
class Edge implements Comparable<Edge>{
    int u;
    int v;
    int wt;

    public Edge(int u, int v, int wt){
        this.u = u;
        this.v = v;
        this.wt = wt;
    }

    public int compareTo(Edge compare){
        return this.wt - compare.wt;
    }
}
public class KruskalsAlgorithm {

    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        ArrayList<Edge> edges = new ArrayList<>();

        for(int i = 0; i < V; i++){
            for(int j = 0; j < adj.get(i).size(); j++){
                int v = adj.get(i).get(j)[0];
                int wt = adj.get(i).get(j)[1];
                edges.add(new Edge(i, v, wt));
            }
        }

        Collections.sort(edges);

        DisjointSet set = new DisjointSet(V);

        int mstWt = 0;
        for(Edge e : edges){
            int u = e.u;
            int v = e.v;
            int wt = e.wt;
            if(set.findUPar(u) != set.findUPar(v)){
                mstWt += wt;
                set.UnionBySize(u, v);
            }
        }

        return mstWt;
    }
}
