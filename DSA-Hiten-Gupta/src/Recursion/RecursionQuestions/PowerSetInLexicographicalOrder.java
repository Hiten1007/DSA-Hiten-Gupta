package Recursion.RecursionQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class PowerSetInLexicographicalOrder {
    public static void main(String[] args) {
        String s = "bac";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        System.out.println(list("", new String(arr)));

    }
    static ArrayList<String> list(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = list(p + ch, up.substring(1));
        ArrayList<String> right = list(p, up.substring(1));

        left.addAll(right);

        return left;
    }
}
