package arrays;

import java.util.Arrays;

public class FindMissingObservations {
    public static void main(String[] args) {
        int[] rolls = {2, 2, 2, 4};
        int n = 8;
        int mean = 4;
        System.out.println(Arrays.toString(missingRolls(rolls, mean, n)));
    }
   static int[] missingRolls(int[] rolls, int mean, int n) {
        int mSum = 0;
        for(int rollsNum : rolls){
            mSum += rollsNum;
        }
        int nSum = mean*(n + rolls.length) - mSum;

        if(nSum < n || nSum > 6*n){
            return new int[] {};
        }

        int base = nSum/ n;
        int remainder = nSum%n;

        int[] result = new int[n];

        for(int i = 0; i < n; i++){
            result[i] = base + (i < remainder ? 1 : 0);
        }
        return result;
    }
}
