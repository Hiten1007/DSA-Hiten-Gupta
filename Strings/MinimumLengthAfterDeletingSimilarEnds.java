package Strings;

public class MinimumLengthAfterDeletingSimilarEnds {
    public static void main(String[] args) {
        String s = "aaaaaa";
        System.out.println(minimumLength(s));
    }
    static int minimumLength(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                break;
            }
            else {
                while (i < j && s.charAt(i) == s.charAt(i + 1)) {
                    i++;
                }
                while (i < j && s.charAt(j - 1) == s.charAt(j)) {
                    j--;
                }
                i++;
                j--;
            }
        }
        return j < i ? 0 : j - i + 1;
    }
}
