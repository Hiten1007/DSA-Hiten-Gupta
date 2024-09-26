package Graphs.GraphsQuestions;

public class numberofenclaves {
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        int[] delR = {0, 1, -1, 0};
        int[] delC = {1, 0, 0, -1};
        for(int i = 0; i < n; i++){
            if(vis[i][0] == 0 && grid[i][0] == 1){
                dfs(i, 0, grid, delR, delC, vis);
            }
            if(vis[i][m - 1] == 0 && grid[i][m - 1] == 1){
                dfs(i, m - 1, grid, delR, delC, vis);
            }
        }
        for(int i = 0; i < m; i++){
            if(vis[0][i] == 0 && grid[0][i] == 1){
                dfs(0, i, grid, delR, delC, vis);
            }
            if(vis[n - 1][i] == 0 && grid[n - 1][i] == 1){
                dfs(n - 1, i, grid, delR, delC, vis);
            }
        }
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(vis[i][j] == 0 && grid[i][j] == 1){
                    count++;
                }
            }
        }
        return count;
    }
    static void dfs(int i, int j, int[][] grid, int[] delC, int[] delR, int[][] vis){
        vis[i][j] = 1;
        int n = grid.length;
        int m = grid[0].length;
        for(int k = 0; k < 4; k++){
            int nR = i + delR[k];
            int nC = j + delC[k];
            if(nR >= 0 && nC >= 0 && nR < n && nC < m && vis[nR][nC] == 0 && grid[nR][nC] == 1){
                dfs(nR, nC, grid, delC, delR, vis);
            }
        }
    }
}
