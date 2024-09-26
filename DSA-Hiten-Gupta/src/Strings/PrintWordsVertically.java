package Strings;

import java.util.ArrayList;
import java.util.List;

public class PrintWordsVertically {

    public static void main(String[] args) {
        String s = "Hiten is a Boy";

        System.out.println(printVertically(s));
    }
    static List<String> printVertically(String s) {
        String[] str = s.split(" ");
        int maxlength = 0;
        for(int i = 0; i < str.length; i++){
            maxlength = Math.max(maxlength, str[i].length());
        }

        List<String> list = new ArrayList<>();

        for(int i = 0; i < maxlength; i++){
            StringBuilder res = new StringBuilder();
            for(String word : str){
                if(i < word.length()){
                    res.append(word.charAt(i));
                }
                else{
                    res.append(" ");
                }
            }
            list.add(res.toString().stripTrailing());
        }

        return list;
    }
}