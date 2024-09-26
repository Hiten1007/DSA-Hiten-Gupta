package Recursion.RecursionQuestions;

import java.util.Arrays;

public class ReverseAString {
    public static void main(String[] args) {
        char[] s = {};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
    static void reverseString(char[] s) {
        if(s.length == 0) return;
        helper(s, 0);
    }
    static void helper(char[] s, int left){
        if(left >= s.length/2){
            return;
        }
        char temp = s[left];
        s[left] = s[ s.length - left - 1];
        s[ s.length - left - 1] = temp;
        helper(s, left + 1);
    }
}
