package Searching.Linearsearch;

import java.util.*;

public class Searchinginstring {
    public static void main(String[] args) {
        String str = "Hiten";
        char target = 'i';
        boolean ans = search(str, target);
        boolean ans2 = search2(str, target);
        System.out.println(ans);
        System.out.println(ans2);
    }
    static boolean search(String str, int target){
        if(str.length() == 0){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    static boolean search2(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
