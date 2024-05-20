package Searching.Linearsearch;

public class SearchMinValue {
    public static void main(String[] args) {
        int[] arr = {18, 12, 7, 3, 16, 28};
        System.out.print(minvalue(arr));
    }
    //assume arr.length!=0;
    static int minvalue(int[] arr){
        int ans = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
