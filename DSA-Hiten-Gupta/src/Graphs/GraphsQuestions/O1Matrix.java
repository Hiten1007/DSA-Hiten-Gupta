package Graphs.GraphsQuestions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class O1Matrix {
    static class Pair{
        int first;
        int second;
        int third;
        public Pair(int first, int second, int third){
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1,0,1,1,0,0,1,0,0,1},
                {0,1,1,0,1,0,1,0,1,1},
                {0,0,1,0,1,0,0,1,0,0},
                {1,0,1,0,1,1,1,1,1,1},
                {0,1,0,1,1,0,0,0,0,1},
                {0,0,1,0,1,1,1,0,1,0},
                {0,1,0,1,0,1,0,0,1,1},
                {1,0,0,0,1,1,1,1,0,1},
                {1,1,1,1,1,1,1,0,1,0},
                {1,1,1,1,0,1,0,0,1,1}
        };
        int[][] dis = updateMatrix(mat);
        for(int[] arr : dis){
            System.out.println(Arrays.toString(arr));
        }
    }
    static int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] dis = new int[n][m];
        int[][] vis = new int[n][m];
        int[] delR = {0, 1, 0, -1};
        int[] delC = {1, 0, -1, 0};
        Queue<Pair> q = new LinkedList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 0) {
                    vis[i][j] = 1;
                    q.add(new Pair(i, j, 0));
                } else {
                    vis[i][j] = 0;
                }
            }
        }

        while(!q.isEmpty()){
            int r = q.peek().first;
            int c = q.peek().second;
            int steps = q.peek().third;
            dis[r][c] = steps;
            q.remove();

            for(int k = 0; k < 4; k++){
                int nR = r + delR[k];
                int nC = c + delC[k];
                if(nR >= 0 && nC >= 0 && nR < n && nC < m && vis[nR][nC] == 0){
                    vis[nR][nC] = 1;
                    q.add(new Pair(nR, nC, steps + 1));
                }
            }
        }
        return dis;
    }
}
