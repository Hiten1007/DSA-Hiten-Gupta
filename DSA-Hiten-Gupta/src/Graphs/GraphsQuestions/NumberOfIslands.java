package Graphs.GraphsQuestions;

import java.util.LinkedList;
import java.util.Queue;


public class NumberOfIslands {
    static class Pair{
        int first;
        int second;
        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public int numIslands(char[][] grid) {
        int[][] vis = new int[grid.length][grid[0].length];
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1' && vis[i][j] == 0){
                    bfs(i, j, vis, grid);
                    count++;
                }
            }
        }
        return count;
    }
    static void bfs(int i, int j, int[][] vis, char[][] grid){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, j));
        int n = grid.length;
        int m = grid[0].length;
        vis[i][j] = 1;
        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();
           for(int delR = -1; delR <= 1; delR++){
               for(int delC = -1; delC <= 1; delC++){
                   int nR = row + delR;
                   int nC = col + delC;
                   if(nR >= 0 && nR < n && nC >= 0 && nC < m && grid[nR][nC] == '1' && vis[nR][nC] == 0){
                       vis[nR][nC] = 1;
                       q.add(new Pair(nR,nC));
                   }
               }
           }
        }
    }
}

