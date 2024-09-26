package Graphs.GraphsQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    public static void main(String[] args) {
        int[][] grid = {{0}};
        System.out.println(orangesRotting(grid));
    }
    static class Pair{
        int first;
        int second;
        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    static int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        int countOne = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 2) {
                    q.add(new Pair(i, j));
                }
                if(grid[i][j] == 1){
                    countOne++;
                }
            }
        }

        if(q.isEmpty()) {
            return countOne == 0 ? 0 : -1;
        }
        int[] delRow = {0, -1, 0, 1};
        int[] delCol = {1, 0, -1, 0};
        int time = -1;
        while(!q.isEmpty()){
            int size = q.size();
            time++;
            for(int i = 0; i < size; i++){
                int row = q.peek().first;
                int col = q.peek().second;
                q.remove();
                for(int j = 0; j < 4; j++){
                    int nR = row + delRow[j];
                    int nC = col + delCol[j];
                    if(nR >= 0 && nC >= 0 && nR < n && nC < m && grid[nR][nC] == 1){
                        q.add(new Pair(nR, nC));
                        grid[nR][nC] = 2;
                    }
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }
        return time;
    }
}
