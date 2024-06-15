package Recursion;

import java.util.ArrayList;

public class Subsequences {
    public static void main(String[] args) {
        String s = "Hiten";
        System.out.println(subsets2("", s));
    }
    static void subsets(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subsets(p + ch, up.substring(1));
        subsets(p, up.substring(1));
    }
    static ArrayList<String> subsets2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subsets2(p + ch, up.substring(1));
        ArrayList<String> right = subsets2(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
