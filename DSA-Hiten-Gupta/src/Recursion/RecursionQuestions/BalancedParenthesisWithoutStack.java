package Recursion.RecursionQuestions;

import java.util.ArrayList;

public class BalancedParenthesisWithoutStack {
    public static void main(String[] args) {
        String s = "[]{{{}}}(}()({})";
        System.out.println(validParenthesis(s));
    }
    static boolean validParenthesis(String s){
        if(s.length() == 1){
            return false;
        }
        int output = findIndex(s, 0);
        return output == 1;
    }
    static int findIndex(String s, int index){
        if (index >= s.length()) return 1;
        char ch = s.charAt(index);
        if(ch == ')' || ch == '}' || ch == ']') return index;

        int bracketIndex = findIndex(s, index + 1);
        if(bracketIndex == -1) return -1;
        int closedBracket = s.charAt(bracketIndex);

        if((ch == '(' && closedBracket == ')')
                || (ch == '{' && closedBracket == '}')
                || (ch == '[' && closedBracket == ']')){
            return findIndex(s, bracketIndex + 1);
        }
        else{
            return - 1;
        }
    }
}
