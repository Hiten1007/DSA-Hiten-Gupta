package Recursion.RecursionQuestions;

public class RemoveAllConsecutiveDuplicates {
    public static void main(String[] args) {
        String s = "HIIITTTTETEETETENNNN";
        System.out.println(removeAllConsecutive(s));
    }
    static String removeAllConsecutive(String s){
        if(s.length() <= 1){
            return s;
        }
        if(s.charAt(0) == s.charAt(1)){
            return removeAllConsecutive(s.substring(1));
        }
        else{
            return s.charAt(0) + removeAllConsecutive(s.substring(1));
        }
    }
}
