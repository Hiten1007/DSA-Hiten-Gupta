package Graphs.GraphsQuestions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {
     static class Pair{
        int first;
        int second;
        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,1,0},{1,0,1}};
        for(int[] arr : floodFill(matrix, 1, 1, 2)){
            System.out.println(Arrays.toString(arr));
        }
    }
    static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        if(image[sr][sc] == color){
            return image;
        }
        Queue<Pair> q = new LinkedList<>();
        int original = image[sr][sc];
        image[sr][sc] = color;
        q.add(new Pair(sr, sc));
        while(!q.isEmpty()){
            int i = q.peek().first;
            int j = q.peek().second;
            q.remove();
            if(i - 1 >= 0){
                if(image[i - 1][j] == original) {
                    image[i - 1][j] = color;
                    q.add(new Pair(i - 1, j));
                }
            }
            if(j - 1 >= 0){
                if(image[i][j - 1] == original) {
                    image[i][j - 1] = color;
                    q.add(new Pair(i , j - 1));
                }
            }
            if(i + 1 < n){
                if(image[i + 1][j] == original) {
                    image[i + 1][j] = color;
                    q.add(new Pair(i + 1, j));
                }
            }
            if(j + 1 < m){
                if(image[i][j + 1] == original) {
                    image[i][j + 1] = color;
                    q.add(new Pair(i, j + 1));
                }
            }
        }
        return image;
    }
}


