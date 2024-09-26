package Sorting.SortingQuestions;

import java.util.Arrays;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 5, 3, 2, 5, 9 ,8 ,6, 1};
        int[] arr2 = { 2, 6, 1, 9, 8};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }
    static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int[] ans = new int[n];
        boolean[] check = new boolean[n];
        int x = 0;
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < n; j++){
                if(arr1[j] == arr2[i]){
                    ans[x++] = arr2[i];
                    check[j] = true;
                }
            }
        }
        int[] left = new int[n - x];
        int k = 0;
        for(int i = 0; i < n; i++){
            if(!check[i]){
                left[k++] = arr1[i];
            }
        }
        Arrays.sort(left);
        k = 0;
        for(int i = 0; i < left.length; i++){
            ans[x++] = left[k++];
        }
        return ans;
    }
}
