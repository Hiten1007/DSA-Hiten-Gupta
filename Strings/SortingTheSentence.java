package Strings;

import java.util.Arrays;

public class SortingTheSentence {
    public static void main(String[] args) {
        String s = "Genius5 is3 a4 Hi1 ten2";
        System.out.println(sortSentence(s));
    }
    static String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] ans = new String[str.length];
        for(int i = 0; i < str.length; i++){
            int n = str[i].length();
            n--;
            int l = str[i].charAt(n) -'0';
            ans[l - 1] = str[i].substring(0, n);
        }
        return String.join(" ", ans);
    }
}
