package Recursion.RecursionQuestions;

public class LengthofAString {
    public static void main(String[] args) {
        String str = "Hiten";
        System.out.println(length(str));
    }
    static int length(String s){
        if(s.isEmpty()){
            return 0;
        }
        return 1 + length(s.substring(1));
    }
}

