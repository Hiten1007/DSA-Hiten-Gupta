package Searching.BinarySearch;

import java.util.Arrays;

public class SortedMatrixSearch {
    public static void main(String[] args) {
        int[][] matrix =
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        int target = 10;
        System.out.println(Arrays.toString(search(matrix, target)));
    }
    static int[] binarysearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart)/2;
            if (matrix[row][mid] == target){
                return new int[] {row, mid};
            }
            if(matrix[row][mid] > target){
                cEnd = mid - 1;
            }
            else{
                cStart = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1){
            return binarysearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols/2;

        while(rStart < rEnd - 1){
            int mid = rStart + (rEnd -rStart)/2;
            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }
            if(matrix[mid][cMid] > target){
                rEnd = mid;
            }
            else{
                rStart = mid;
            }
        }

        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if(matrix[rStart + 1][cMid] == target){
            return new int[]{rStart + 1, cMid};
        }


        if(target <= matrix[rStart][cMid - 1]){
            return binarysearch(matrix, rStart, 0, cMid - 1, target);
        }
        if(matrix[rStart][cMid + 1] <= target && target <= matrix[rStart][cols - 1]){
            return binarysearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        if(target <= matrix[rStart + 1][cMid + 1]){
            return binarysearch(matrix, rStart + 1, 0, cMid + 1, target);
        }

        else{
            return binarysearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}
