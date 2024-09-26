package Sorting.SortingQuestions;

import java.util.*;

public class MaximumThreeNumProduct {
    public static void main(String[] args) {
        int[] arr = {-1000, -98, 0, 1, 2, 3, 4};
        System.out.println(maximumProduct(arr));
    }
    static int maximumProduct(int[] nums) {
        int maxp1 = Integer.MIN_VALUE, maxp2 = Integer.MIN_VALUE, maxp3 = Integer.MIN_VALUE;
        int minp1 = Integer.MAX_VALUE, minp2 = Integer.MAX_VALUE;
        for (int ele : nums) {
            if(maxp1<=ele){
                maxp3=maxp2;
                maxp2=maxp1;
                maxp1=ele;
            }
            if(maxp2<=ele && ele<maxp1){
                maxp3=maxp2;
                maxp2=ele;
            }
            if(maxp3<=ele && ele<maxp2){
                maxp3=ele;
            }
            if(minp1>=ele){
                minp2=minp1;
                minp1=ele;
            }
            if(minp2>=ele && ele>minp1){
                minp2=ele;
            }
        }
        return Math.max(maxp1 * maxp2 * maxp3, minp1 * minp2 * maxp1);
    }
}
