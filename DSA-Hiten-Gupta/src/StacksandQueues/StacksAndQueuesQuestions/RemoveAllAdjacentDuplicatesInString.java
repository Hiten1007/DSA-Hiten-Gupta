package StacksandQueues.StacksAndQueuesQuestions;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String s = "aaabbbbabababababab";
        System.out.println(removeDuplicates(s));
    }
    static String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        st.add(s.charAt(0));
        StringBuilder res = new StringBuilder();
        for(char ch : s.substring(1, s.length()).toCharArray()){
            if(!st.isEmpty() && ch == st.peek()){
                st.pop();
            }
            else{
                st.add(ch);
            }
        }

        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.reverse().toString();
    }
}
