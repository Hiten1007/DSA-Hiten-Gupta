package StacksandQueues.StacksAndQueuesQuestions;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] arr = {-2, -1, 1, 2};
        System.out.println(Arrays.toString(asteroidCollision(arr)));
    }
    static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        int i = 0;
        while(i < asteroids.length){
            if(st.isEmpty()){
                st.push(asteroids[i]);
                i++;
            } else if (!st.isEmpty() && st.peek() < 0 && asteroids[i] > 0) {
                st.push(asteroids[i]);
                i++;
            }

             else if(!st.isEmpty() && isSame(asteroids[i], st.peek()) ){
                st.push(asteroids[i]);
                i++;
            }
            else {
                if (asteroids[i] + st.peek() == 0) {
                    st.pop();
                    i++;
                } else if (isSame(asteroids[i] + st.peek(), asteroids[i])) {
                    st.pop();
                }
                else if(!isSame(asteroids[i] + st.peek(), asteroids[i])){
                  i++;
                }
            }
        }
        int[] ans = new int[st.size()];
        int size = st.size();
        while(!st.isEmpty()){
            ans[size - 1] = st.pop();
            size--;
        }
        return ans;
    }
    static boolean isSame(int num1, int num2){
        return (float)(num1)/(float)(num2) > 0;
    }
}
