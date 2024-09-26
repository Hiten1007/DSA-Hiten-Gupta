package Strings;

public class AlikeStrings {
    public static void main(String[] args) {
        String s = "or";
        System.out.println(halvesAreAlike(s));
    }
    static boolean halvesAreAlike(String s) {
        int n = s.length();
        s = s.toLowerCase();
        String s1 = s.substring(0,n/2);
        String s2 = s.substring(n/2, n);
        int count = 0;
        int count2 = 0;
        for(int i = 0; i < n/2; i++){
            if(s1.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                count++;
            }
            if(s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i' || s2.charAt(i) == 'o' || s2.charAt(i) == 'u'){
                count2++;
            }
        }
        return count == count2;
    }

}
