package Strings;

public class ReverseWordsinStrings {
    public static void main(String[] args) {
        String s = "    a good   everyone    ";
        System.out.println(reverseWords(s));
    }
    static String reverseWords(String s) {
        String[] str  = s.split(" ");
        StringBuilder st = new StringBuilder();
        for(int i = str.length - 1; i >= 0; i--){
            if(!str[i].equals("")){
                st.append(str[i]).append(" ");
            }
        }
        return st.toString().trim();
    }
}
