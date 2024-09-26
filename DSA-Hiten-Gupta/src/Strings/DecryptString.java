package Strings;

import java.util.*;

public class DecryptString {
    public static void main(String[] args) {
        String s = "37523#824#";
        System.out.println(freqAlphabets(s));
    }
    static String freqAlphabets(String s) {
        StringBuilder str = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == '#'){
                int x = s.charAt(i - 1) - '0';
                int y = (s.charAt(i - 2) - '0') * 10;
                str.append((char)(y+x+96));
                i = i - 2;
            } else if (s.charAt(i) >= '1' && s.charAt(i) <= '9'){
                str.append((char)(s.charAt(i) + 48));
            }
        }
        str.reverse();
        return str.toString();
    }
}
