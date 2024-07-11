package StacksandQueues.StacksAndQueuesQuestions;

import java.util.Stack;

public class RemoveOuterMostParenthesis {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(st.size() >= 1){
                    res.append(ch);
                }
                st.push(ch);
            }
            else{
                if(st.size() > 1){
                    res.append(ch);
                }
                st.pop();
            }
        }
        return res.toString();
    }
}
