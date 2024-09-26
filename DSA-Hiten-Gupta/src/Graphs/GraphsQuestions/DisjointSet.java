package Graphs.GraphsQuestions;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet {
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();

    public DisjointSet(int n){
        for(int i = 0; i <= n; i++){
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }
    public int findUPar(int node){
        if(node == parent.get(node)){
            return node;
        }
        int ulp = findUPar(parent.get(node));
        parent.set(node, ulp);
        return ulp;
    }
    public void UnionByRank(int u, int v){
        int ulv = findUPar(v);
        int ulu = findUPar(u);
        if(ulv == ulu) return;
        if(rank.get(ulv) > rank.get(ulu)){
            parent.set(ulu, ulv);
        }
        else if(rank.get(ulv) < rank.get(ulu)){
            parent.set(ulv, ulu);
        }
        else{
            parent.set(ulv, ulu);
            int rankU = rank.get(ulu);
            rank.set(ulu, rankU + 1);
        }
    }
    public void UnionBySize(int u, int v){
        int ulu = findUPar(u);
        int ulv = findUPar(v);
        if(ulu == ulv) return;
        
        if(size.get(ulu) < size.get(ulv)){
            parent.set(ulu, ulv);
            size.set(ulv, size.get(ulu) + size.get(ulv));
        }
        else{
            parent.set(ulv, ulu);
            size.set(ulu, size.get(ulv) + size.get(ulu));
        }
    }
}
