package Strings;

public class ReverseWordsInStringIII {
    public static void main(String[] args) {
        String name = "My name is Hiten Gupta";
        System.out.println(reverseWords(name));
    }
    static String reverseWords(String s) {
        StringBuilder build = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        String[] str = s.split(" ");
        for(int i = 0; i < str.length; i++){
            build.append(str[i]);
            build.reverse();
            ans.append(build);
            ans.append(" ");
            build.delete(0, str[i].length());
        }
        ans.deleteCharAt(ans.length() - 1);
        return ans.toString();
    }
}
