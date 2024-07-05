package StacksandQueues.StacksAndQueuesQuestions;

import java.util.Stack;

public class MinimumInsertionstoMakeParenthesisiValid {
    public int minAddToMakeValid(String s) {
        Stack<Character>stack = new Stack<>();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            }
            else{
                if(ch == ')'){
                    if(stack.isEmpty() || stack.peek() != '('){
                        count++;
                    }
                    else{
                        stack.pop();
                    }
                }
            }
        }
        return stack.size() + count;
    }
}
