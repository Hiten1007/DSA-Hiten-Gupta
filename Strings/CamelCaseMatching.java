package Strings;

import java.util.ArrayList;
import java.util.List;

public class CamelCaseMatching {
    public static void main(String[] args) {
        String str = "Ab";
        String[] queries = {"Aabad", "Aaabc", "AaAaab", "aab"};
        System.out.println(camelMatch(queries, str));
    }
    static List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> list = new ArrayList<>();
        for(String word : queries){
            if(check(word, pattern)){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
    static boolean check(String word, String pattern){
        int count = 0;
        int i = 0;
        int j = 0;
        StringBuilder res = new StringBuilder();
        while(i < word.length() && j < pattern.length()){
            if(word.charAt(i) == pattern.charAt(j) || (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')){
                res.append(word.charAt(i));
                j++;
                count++;
            }

            i++;
        }

        while(i < word.length()){
            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                res.append(word.charAt(i));
            }
            i++;
        }

        return res.toString().equals(pattern);
    }
}
