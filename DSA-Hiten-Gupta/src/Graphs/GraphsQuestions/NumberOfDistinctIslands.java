package Graphs.GraphsQuestions;


import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberOfDistinctIslands {
    int countDistinctIslands(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Set<String> set = new HashSet<>();
        int[][] vis = new int[n][m];
        int[] delR = {0, 1, 0, -1};
        int[] delC = {1, 0, -1, 0};
        String[] directions = {"R", "D", "L", "U"};
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < m; j++){
                if(vis[i][j] == 0 && grid[i][j] == 1){
                    StringBuilder str = new StringBuilder();
                    dfs(i, j, grid, delR, delC, vis, directions, str.append("O"));
                    set.add(str.toString());
                }
            }
        }
        return set.size();
    }
    void dfs(int i, int j, int[][] grid, int[] delR, int[] delC, int[][] vis, String[] directions,StringBuilder res){
        vis[i][j] = 1;
        int n = grid.length;
        int m = grid[0].length;
        for(int k = 0; k < 4; k++){
            int nR = i + delR[k];
            int nC = j + delC[k];
            if(nR >= 0 && nC >= 0 && nR < n && nC < m && grid[nR][nC] == 1 && vis[nR][nC] == 0){
                res.append(directions[k]);
                dfs(nR, nC, grid, delR, delC, vis, directions, res);
                res.append("B");
            }
        }
    }
}
