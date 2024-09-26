package arrays;

import java.util.*;

public class Pangramsentence {
    public static void main(String[] args) {
        String sentence = "abcdefghijklmnopqrstuvwxyz";
        System.out.print(checkIfPangram(sentence));
    }
    static boolean checkIfPangram(String sentence) {
        for(char i = 'a'; i <= 'z'; i++){
            if(!sentence.contains(String.valueOf(i))){
                return false;
            }
        }
        return true;
    }
}
