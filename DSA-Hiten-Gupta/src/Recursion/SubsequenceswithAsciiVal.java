package Recursion;

import java.util.ArrayList;

public class SubsequenceswithAsciiVal {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(ascii("", s));
    }
    static ArrayList<String> ascii(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> first = ascii(p, up.substring(1));
        ArrayList<String> second = ascii(p + ch, up.substring(1));
        ArrayList<String> third = ascii(p + (ch + 0), up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
