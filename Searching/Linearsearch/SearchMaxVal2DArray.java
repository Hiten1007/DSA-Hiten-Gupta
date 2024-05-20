package Searching.Linearsearch;

public class SearchMaxVal2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 3, 14},
                {23, 15, 6},
                {18, 9, 27}};
        int ans = maxval(arr);
        System.out.print(ans);
    }
    static int maxval(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
