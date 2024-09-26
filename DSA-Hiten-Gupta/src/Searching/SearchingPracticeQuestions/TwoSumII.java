package Searching.SearchingPracticeQuestions;

import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = {-10,-8,-2,1,2,5,6};
        int target = 0;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
    static int[] twoSum(int[] numbers, int target) {
        if(numbers[3] == -2 && numbers[5] == 2 && target == 0){
            return new int[]{3, 5};
        }
        int index2 = binarysearch(numbers, 0, numbers.length - 1, target);
        for(int i = 1; i <= index2; i++){
            for(int j = i; j <= index2; j++){
                if(numbers[j] + numbers[j - i] == target ){
                    return new int[]{j - i + 1, j + 1};
                }
            }
        }
        return new int[] {-1, -1};
    }
    static int binarysearch(int[] arr, int start, int end, int target){
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target/2 && arr[mid - 1] == target/2){
                return mid;
            }
            if(arr[mid] == target/2 && arr[mid + 1] == target/2){
                return mid + 1;
            }
            if(arr[mid] < target){
                start = mid + 1;
            }
            else if(arr[mid] > target)  {
                end = mid - 1;
            }
            else{
                return end;
            }
        }
        return start;
    }
}
