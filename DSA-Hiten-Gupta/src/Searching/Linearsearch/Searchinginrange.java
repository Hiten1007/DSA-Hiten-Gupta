package Searching.Linearsearch;

public class Searchinginrange {
    public static void main(String[] args) {
        int[] arr = {14, 5, -7, 18, 9, 28};
        int target = -7;
        int start = 1;
        int end = 4;
        System.out.println(linearsearch(arr, target, start, end));
    }
    static int linearsearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int index = start; index <= end; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
