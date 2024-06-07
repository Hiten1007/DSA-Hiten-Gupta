package Strings;

public class SplitStringsMakePalindrome {
    public static void main(String[] args) {
        String a = "p";
        String b = "y";
        System.out.println(checkPalindromeFormation(a, b));
    }
    static boolean checkPalindromeFormation(String a, String b) {
        return validate(a, b) || validate(b, a);
    }
    static boolean validate(String a, String b){
        int l = 0;
        int r = a.length() - 1;
        while(l < r){
            if(a.charAt(l) != b.charAt(r)) {
                break;
            }
                l++;
                r--;
            }
        return validate(a, l, r) || validate(b, l, r);
        }
    static boolean validate(String a, int l , int r){
        while(l < r){
            if(a.charAt(l) != a.charAt(r)) {
                break;
            }
            l++;
            r--;
        }
        return l>= r;
    }
}
