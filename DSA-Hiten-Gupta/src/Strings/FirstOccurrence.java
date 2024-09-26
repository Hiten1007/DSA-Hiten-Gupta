package Strings;

public class FirstOccurrence {
    public static void main(String[] args) {
        String str = "mississippi";
        String s = "sipp";
        System.out.println(strStr(str, s));
    }
    static int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()){
            return -1;
        }
        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            if(haystack.substring(i, i + needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
