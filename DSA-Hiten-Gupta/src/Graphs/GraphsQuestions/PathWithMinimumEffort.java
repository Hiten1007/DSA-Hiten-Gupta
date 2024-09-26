package Graphs.GraphsQuestions;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PathWithMinimumEffort {
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

    public static void main(String[] args) {
        int[][] grid = {
                {1, 2, 2},
                {3, 8, 2},
                {5, 3, 5}
        };
        System.out.println(minimumEffortPath(grid));
    }
    static int minimumEffortPath(int[][] heights) {
        int n = heights.length;;
        int m = heights[0].length;
        int[][] dis = new int[n][m];

        for(int[] arr : dis){
            Arrays.fill(arr, (int)(Integer.MAX_VALUE));
        }
        dis[0][0] = 0;

        int[] delR = {0, 1, 0, -1};
        int[] delC = {1, 0, -1, 0};

        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> x.w - y.w);

        pq.add(new Pair(0, 0, 0));

        while(!pq.isEmpty()){
            int i = pq.peek().i;
            int j = pq.peek().j;
            int w = pq.remove().w;


            if(i == n - 1 && j == m - 1){
                return w;
            }

            for(int k = 0; k < 4; k++){
                int nR = i + delR[k];
                int nC = j + delC[k];

                if(nR >= 0 && nC >= 0 && nR < n && nC < m){
                    int newEffort = Math.max(Math.abs(heights[nR][nC] - heights[i][j]), w);

                    if(newEffort < dis[nR][nC]){
                        dis[nR][nC] = newEffort;
                        pq.add(new Pair(nR, nC, newEffort));
                    }
                }
            }
        }
        return 0;
    }
}
