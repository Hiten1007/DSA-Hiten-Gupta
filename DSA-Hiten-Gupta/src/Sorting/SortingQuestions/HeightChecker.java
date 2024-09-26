package Sorting.SortingQuestions;

import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 4, 3};
        System.out.println(heightChecker(arr));
    }
    static int heightChecker(int[] heights) {
        int[] res = new int[heights.length];
        for(int i  = 0; i < heights.length; i++){
            res[i] = heights[i];
        }
        int count = 0;
        Arrays.sort(heights);
        for(int i = 0; i < heights.length; i++){
            if(res[i] != heights[i]){
                count++;
            }
        }
        return count;
    }
}
