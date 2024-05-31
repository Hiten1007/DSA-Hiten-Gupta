package Sorting.SortingQuestions;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 0, 0};
        int m = 3;
        int[] arr2 = {7, 2};
        int n = 2;
        merge(arr1, m, arr2, n);
        System.out.println(Arrays.toString(arr1));
    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        for(int i = m; i < m + n; i++){
            nums1[i] = nums2[k];
            k++;
        }
        for(int i = 0; i < nums1.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(nums1[j] < nums1[j - 1]){
                    int temp = nums1[j];
                    nums1[j] = nums1[j - 1];
                    nums1[j - 1] = temp;
                }
            }
        }
    }
}
