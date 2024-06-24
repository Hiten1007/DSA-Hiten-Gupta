package Recursion.RecursionQuestions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PrintPalindromicPartitions {
    public static void main(String[] args) {
        String s = "Katyayini";
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        int ind = 0;
        ArrayList<String> curr = new ArrayList<>();

        partition(res, s, ind, curr);

        for(ArrayList<String>part : res){
            System.out.println(part);
        }
    }

    static void partition(ArrayList<ArrayList<String>> res, String s, int ind, ArrayList<String> curr) {
        if(ind == s.length()){
            res.add(new ArrayList<String>(curr));
            return;
        }
        String temp = "";
        for(int i = ind; i < s.length(); i++){
            temp += s.charAt(i);
            if(pallindrome(temp)){
                curr.add(temp);

                partition(res, s, i + 1, curr);

                curr.remove(curr.size() - 1);
            }
        }
    }
    static boolean pallindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
