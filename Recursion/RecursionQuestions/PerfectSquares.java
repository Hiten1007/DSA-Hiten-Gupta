package Recursion.RecursionQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PerfectSquares {
    public static void main(String[] args) {
        int n = 35 ;
        System.out.println(numSquares(n));
    }
    static int numSquares(int n){
        int res = n;
        int num = 2;
        while(num*num <= n){
            int x = res/(num*num);
            int y = res%(num*num);
            res = Math.min(res, x + numSquares(y));
            ++num;
        }
        return res;
    }
}
