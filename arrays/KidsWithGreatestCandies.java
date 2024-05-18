package arrays;

import java.util.*;

public class KidsWithGreatestCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number of extra candies : ");
        int extracandies = sc.nextInt();
        List<Boolean> list = kidsWithCandies(arr, extracandies);
        System.out.print(list);
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = candies[0];
        for(int i = 1; i < candies.length; i++){
            max = Math.max(max, candies[i]);
        }

        List<Boolean> list = new ArrayList<Boolean>();

        for(int i = 0; i < candies.length; i++){
            if((candies[i] + extraCandies) < max ){
                list.add(false);
            }
            else{
                list.add(true);
            }
        }
        return list;
    }
}
