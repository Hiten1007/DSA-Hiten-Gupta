package arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(money(arr));
    }
    static int money(int[] arr){
        int sum1 = arr[0];
        int sum2 = 0;
        if(arr.length > 1) {
            sum2 = arr[1];
        }
        for(int i = 2; i < arr.length; i++){

                sum1 = sum1 + arr[i];

                sum2 = sum2 + arr[i];

        }
        return Math.max(sum1, sum2);
    }
}
