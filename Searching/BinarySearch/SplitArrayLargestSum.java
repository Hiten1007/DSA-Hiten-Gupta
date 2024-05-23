package Searching.BinarySearch;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 18, 19, 21};
        int m = 3;
        System.out.println(splitArray(arr, m));
    }
    static int splitArray(int[] nums, int m){
        int start = 0;
        int end = 0;
        for (int num : nums) {
            start = Math.max(num, start);
            end += num;
        }
        while(start < end){
            int mid = start + (end - start)/2;
            int sum = 0;
            int pieces = 1;
            for(int num : nums) {
                if(sum + num > mid){
                    sum = num;
                    pieces++;
                }
                else{
                    sum += num;
                }
            }
            if(pieces > m){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }
        return end;
    }
}
