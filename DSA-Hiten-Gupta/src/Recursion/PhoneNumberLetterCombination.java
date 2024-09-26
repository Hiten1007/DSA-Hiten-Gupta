package Recursion;

import java.util.Arrays;

public class PhoneNumberLetterCombination {
    public static void main(String[] args) {
        String s = "23";
        combinations("", s);
    }
    static void combinations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = (up.charAt(0)) - '0';
        for(int i = (digit - 1)*3; i < digit*3; i++){
            char ch = (char)('a' + i);
            combinations(p + ch, up.substring(1));
        }
    }
}
