package Strings;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "P";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String s) {
        String ans = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
                ans += (char)(s.charAt(i) + 32);
            }
            else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                ans+=s.charAt(i);
            }
            else if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                ans+=s.charAt(i);
            }
        }
        int left = 0;
        int right = ans.length() - 1;
        for(int i = 0; i < ans.length()/2; i++){
            if(ans.charAt(left) != ans.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
