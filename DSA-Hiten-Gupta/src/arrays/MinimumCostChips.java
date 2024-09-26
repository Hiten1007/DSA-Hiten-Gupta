package arrays;

public class MinimumCostChips {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(cost(arr));
    }
    static int cost(int[] arr){
        int n = arr.length;
        int[] count = new int[n];
        if(n == 2){
            if(arr[0] > arr[1]){
                return arr[0] - arr[1];
            }
            else {
                return arr[1] - arr[0];
            }
        }
        if(n == 1){
            return 0;
        }
        for(int i = 0; i < arr.length; i++){

            count[arr[i]-1]++;
        }
        int max = Math.max(count[0], Math.max(count[1], count[2]));
        if(max == count[0] && max == count[1] ){
            return count[1];
        }
        if(max == count[0] && max == count[2]){
            return count[1];
        }
        if(max == count[1] && max == count[2]){
            return count[1];
        }
        if(max == count[0]){
            return count[1];
        }
        if(max == count[1]){
            return count[0] + count[2];
        }
        else {
            return  count[1];
        }
    }
}
