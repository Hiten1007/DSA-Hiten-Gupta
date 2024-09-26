package Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flowwes", "fliruej"};
        System.out.println(longestCommonPrefix(str));
    }
    static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];
        for(int i = 0; i < first.length(); i++){
            if(first.charAt(i) != last.charAt(i)){
                break;
            }
            result.append(first.charAt(i));
        }
        return result.toString() ;
        /*if(strs.length == 1){
            return strs[0];
        }
        String common = "";
        int j = 0;
        while(j < strs[0].length()){
            if(strs[0].charAt(j) == strs[1].charAt(j)){
                common += strs[0].charAt(j);
                j++;
            }
            else{
                break;
            }
        }
        if(common.isEmpty()) return "";
        for(int i = 2; i < strs.length; i++){
            String newc = "";
            j = 0;
            while(j < common.length()){
                if(common.charAt(j) == strs[i].charAt(j)){
                    newc += common.charAt(j);
                    j++;
                }
                else{
                    break;
                }
            }
            if(newc.isEmpty()) return "";
            common = newc;
        }
        return common;

         */
    }
}
