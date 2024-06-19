package Recursion.RecursionQuestions;

public class FirstUpperCaseLetter {
    public static void main(String[] args) {
        String s = "shrEik";
        int i = 0;
        System.out.println(firstUpperCase(s, 0));
    }
    static char firstUpperCase(String s, int i){
        if(i == s.length()){
            return 'a';
        }
        if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
            return s.charAt(i);
        }
        return firstUpperCase(s, i + 1);
    }
}
