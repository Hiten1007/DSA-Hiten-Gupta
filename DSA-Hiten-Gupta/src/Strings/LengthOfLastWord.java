package Strings;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hiten has a great life";
        System.out.println(lengthOfLastWord(s));
    }
    static int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        return str[str.length - 1].length();
    }
}
