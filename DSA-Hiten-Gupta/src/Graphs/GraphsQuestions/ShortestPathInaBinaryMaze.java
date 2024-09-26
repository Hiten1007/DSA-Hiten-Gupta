package Graphs.GraphsQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInaBinaryMaze {
    public static void main(String[] args) {
        int[][] grid = {{0,1,1,1,1,1,1,1},{0,1,1,0,0,0,0,0},{0,1,0,1,1,1,1,0},{0,1,0,1,1,1,1,0},{0,1,1,0,0,1,1,0},{0,1,1,1,1,0,1,0},{0,0,0,0,0,1,1,0},{1,1,1,1,1,1,1,0}};
        System.out.println(shortestPathBinaryMatrix(grid));
    }
    static class Pair{
        int i;
        int j;
        int w;
        public Pair(int i, int j, int w){
            this.i = i;
            this.j = j;
            this.w = w;
        }
    }
    static int shortestPathBinaryMatrix(int[][] grid) {
        Queue<Pair> pq = new LinkedList<>();
        if(grid[0][0] == 0) {
            pq.add(new Pair(0, 0, 1));
        }


        int n = grid.length;
        int[][] vis = new int[n][n];
        while(!pq.isEmpty()){
            int r = pq.peek().i;
            int c = pq.peek().j;
            int w = pq.remove().w;

            if(r == n - 1 && c == n -1) {
                return w;
            }

            for(int i = -1; i <= 1; i++){
                for(int j = -1; j <= 1; j++){
                    int nR = r + i;
                    int nC = c + j;

                    if(nR >= 0 && nC >= 0 && nR < n && nC < n && grid[nR][nC] == 0 && vis[nR][nC] == 0){
                        pq.add(new Pair(nR, nC, w + 1));
                        vis[nR][nC] = 1;
                    }
                }
            }
        }
        return -1;
    }
}
