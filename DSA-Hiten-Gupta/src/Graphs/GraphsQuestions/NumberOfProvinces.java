package Graphs.GraphsQuestions;

import java.util.ArrayList;
import java.util.List;

public class NumberOfProvinces {
    public static void main(String[] args) {
        int[][] m = {{1,1,0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(findCircleNum(m));
    }
    static int findCircleNum(int[][] isConnected) {
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < isConnected.length; i++){
            list.add(new ArrayList<>());
        }

        for(int i = 0; i < isConnected.length; i++){
            for(int j = 0; j < isConnected[0].length; j++){
                if(isConnected[i][j] == 1){
                    list.get(i).add(j);
                }
            }
        }

        boolean[] vis = new boolean[isConnected.length];
        int count = 0;
        for(int i = 0; i < isConnected.length; i++){
            if(!vis[i]){
                dfs(i, vis, list);
                count++;
            }
        }
        return count;
    }
    static void dfs(Integer i, boolean[] vis, List<List<Integer>> list){
        vis[i] = true;
        for(Integer n : list.get(i)){
            if(!vis[n]){
                dfs(n, vis, list);
            }
        }
    }
}
