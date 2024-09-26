package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(permu2("", "abc"));
    }
    static void permu1(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i= 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String l = p.substring(i, p.length());
            permu1(f + ch + l, up.substring(1));
        }
    }

    static List<String> permu2(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }
        List<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i= 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String l = p.substring(i, p.length());
            ans.addAll(permu2(f + ch + l, up.substring(1)));
        }
        return ans;
    }
    static int permu3(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for(int i= 0; i <= p.length(); i++){
            String f = p.substring(0, i);
            String l = p.substring(i, p.length());
            count += (permu3(f + ch + l, up.substring(1)));
        }
        return count;
    }
}
