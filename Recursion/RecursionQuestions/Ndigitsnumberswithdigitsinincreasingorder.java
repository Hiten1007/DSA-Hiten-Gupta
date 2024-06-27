package Recursion.RecursionQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class Ndigitsnumberswithdigitsinincreasingorder {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(increasingNumbers(n));
    }

    public static ArrayList<Integer> increasingNumbers(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        if(n == 1) list.add(0);
        for(int i = 1; i <= 9; i++){
            traverse(list, n, "" + i);
        }
        return list;
    }
    static void traverse(ArrayList<Integer> list, int n, String str){
        if(str.length() == n){
            list.add(Integer.parseInt(str));
        }
        String temp = str;
        int num = Character.getNumericValue(str.charAt(str.length() - 1));
        num += 1;
        if(num <= 9){
            while(num <= 9){
                str += num;
                traverse(list, n, str);
                num += 1;
                str = temp;
            }
        }
    }
}
