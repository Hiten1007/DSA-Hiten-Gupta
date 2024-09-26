package arrays;

import java.util.*;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] arr = {1, 0,-3, 2, -5, 3, -2 };
        System.out.print(largestAltitude((arr)));
    }
    static int largestAltitude(int[] gain) {
        int max = 0;
        int curmax = 0;
        for(int altitude : gain){
            curmax = curmax + altitude;
            max = Math.max(curmax, max);
        }
        return max;
    }
}
