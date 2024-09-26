package Strings;

import java.util.ArrayList;

public class LongestPalindromicSubsequence {
    public static void main(String[] args) {
        String s = "JNCSNCDHMNNMHJSCHIJSDCDU";
        System.out.println(longestPalindromeSubseq(s));
    }
    static int longestPalindromeSubseq(String s) {
        return helper("", s);
    }

    static int helper(String p, String up){
        if(up.isEmpty()){
            if(palindrome(p)) {
                return p.length();
            }
            return 0;
        }
        char ch = up.charAt(0);
        int left = helper(p, up.substring(1));
        int right = helper(p + ch, up.substring(1));
        return Math.max(left, right);
    }
    static boolean palindrome(String s){
        if(s.length() <= 1){
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
