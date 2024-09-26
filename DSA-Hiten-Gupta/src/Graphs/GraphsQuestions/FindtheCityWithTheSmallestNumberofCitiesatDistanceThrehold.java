package Graphs.GraphsQuestions;

import java.util.Arrays;

public class FindtheCityWithTheSmallestNumberofCitiesatDistanceThrehold {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] matrix = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i != j){
                    matrix[i][j] = Integer.MAX_VALUE;
                }
                else{
                    matrix[i][j] = 0;
                }
            }
        }

        for(int x = 0; x < edges.length; x++){
            int i = edges[x][0];
            int j = edges[x][1];
            int w = edges[x][2];
            matrix[i][j] = w;
            matrix[j][i] = w;
        }

        for(int k = 0; k < n; k++){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if(matrix[i][k] < distanceThreshold + 1 && matrix[k][j] < distanceThreshold + 1){
                        matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                    }
                }
            }
        }
        int maxindex = 0;
        int max = 0;
        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = 0; j < n; j++){
                if(matrix[i][j] > distanceThreshold){
                    count++;
                }
            }
            if(max <= count){
                maxindex = i;
                max = count;
            }
        }
        return maxindex;
    }
}
