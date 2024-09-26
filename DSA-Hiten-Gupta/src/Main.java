import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "45320";
        System.out.println(getSmallestString(s));
    }
    static String getSmallestString(String s) {
        StringBuilder res = new StringBuilder();
        int cur = 0;
        for(int i = 0; i < s.length() - 1; i++){
            if(isSame(s.charAt(i), s.charAt(i + 1)) && s.charAt(i) > s.charAt(i + 1)){
                res.append(s.charAt(i + 1));
                res.append(s.charAt(i));
                i++;
                cur = i;
                break;
            }
            else {
                res.append(s.charAt(i));
                cur = i;
            }
        }
        res.append(s.substring(cur + 1));
        return res.toString();
    }
    static boolean isSame(char s1, char s2){
       return ((s1 - '0') & 1) == 0 && ((s2 - '0') & 1) == 0 || ((s1 - '0') & 1) == 1 && ((s2 - '0') & 1) == 1;
    }
}