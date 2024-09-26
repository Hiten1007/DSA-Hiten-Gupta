package Graphs.GraphsQuestions;

import java.util.*;
class Disjoint{
    ArrayList<Integer> size = new ArrayList<>();
    ArrayList<Integer> parent = new ArrayList<>();
    public Disjoint(int n){
        for(int i = 0; i < n; i++){
            size.add(1);
            parent.add(i);
        }
    }
    public int findUPar(int node){
        if(node == parent.get(node)){
            return node;
        }
        int u = findUPar(parent.get(node));
        parent.set(node, u);
        return u;
    }
    public void UnionBySize(int u, int v){
        int ulu = findUPar(u);
        int ulv = findUPar(v);
        if(size.get(ulu) > size.get(ulv)){
            parent.set(ulv, ulu);
            size.set(ulu, size.get(ulu) + size.get(ulv));
        }
        else{
            parent.set(ulu, ulv);
            size.set(ulv, size.get(ulu) + size.get(ulv));
        }
    }
}
public class numberofoperationstomakenetworkconnected {
    public static void main(String[] args) {
        int n = 4;
        int[][] x = {{0,1},{0,2},{1,2}};
        System.out.println(makeConnected(n, x));
    }

    static int makeConnected(int n, int[][] connections) {
        if(n - 1 > connections.length){
            return -1;
        }
        DisJoint set = new DisJoint(n);
        int extra = 0;
        for(int i = 0; i < connections.length; i++){
            int u = connections[i][0];
            int v = connections[i][1];
            if(set.findUPar(u) != set.findUPar(v)){
                set.UnionBySize(u, v);
            }
            else{
                extra++;
            }
        }
        int countSameP = -1;
        ArrayList<Integer> arr = set.parent;
        for(int i = 0; i < arr.size(); i++){
            if(i == arr.get(i)){
                countSameP++;
            }
        }

        if(countSameP <= extra){
            return countSameP;
        }
        return -1;
    }
}
