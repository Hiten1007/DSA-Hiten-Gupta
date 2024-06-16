package Strings;

import java.util.Arrays;

public class MaximumRemovableCharacters {
    public static void main(String[] args) {
        String s = "Shubhangi";
        String p = "hang";
        int[] removable = {1, 4, 3, 5};
        System.out.println(maximumRemovals(s, p, removable));
    }

    static int maximumRemovals(String s, String p, int[] removable) {
        char[] ch = s.toCharArray();
        char[] ph = p.toCharArray();
        int low = 0;
        int high = removable.length;
        while(low <= high){
            int mid = (high + low)/2;

            for(int i = 0; i < mid; i++){
                ch[removable[i]] = '#';
            }

            if(isSubsequence(ch, ph)){
                low = mid + 1;
            }
            else{
                for(int i = 0; i < mid; i++){
                    ch[removable[i]] = s.charAt(removable[i]);
                }
                high = mid - 1;
            }
        }
        return high;
    }

    static boolean isSubsequence(char[] ch, char[] ph){
        int i = 0;
        int j = 0;
        while(j < ch.length && i < ph.length){
            if(ph[i] == ch[j]){
                i++;
            }
            j++;
        }
        if(i == ph.length) return true;
        return false;
    }
}