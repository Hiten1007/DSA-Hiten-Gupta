package Strings;

public class ValidPalidromeII {
    public static void main(String[] args) {
        String s = "deeeee";
        System.out.println(validPalindrome(s));
    }

    static boolean validPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}



/*        int l = 0;
        int r = s.length() - 1;
        int count1 = 0;
        int count2 = 0;
        while(l < r){
            if(s.charAt(l)!= s.charAt(r)){
                r--;
                count1++;
            }
            else{
                l++;
                r--;
            }
        }
        l = 0;
        r = s.length() - 1;
        while(l < r){
            if(s.charAt(l)!= s.charAt(r)){
                l++;
                count2++;
            }
            else{
                l++;
                r--;
            }
        }
        return Math.min(count1, count2) <= 1;
 */

