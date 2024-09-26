package Recursion;

public class ReversenumberandcheckforPalindrome {
    public static void main(String[] args) {
        int num = 132231;
        System.out.println(rev2(num));
        System.out.println(palidrome(num));
    }
/*    static int sum = 0;
    static void rev(int n){
        if(n==0) return;
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev(n/10);
    }
 */
    static int rev2(int n){
        int digits = (int)(Math.log10(n) + 1);
        return helper(n, digits);
    }
    static int helper(int n, int digits){
        if(n % 10 == n){
            return n;
        }
        return n %10 * (int)Math.pow(10, digits - 1) + helper(n/10, digits - 1);
    }
    static boolean palidrome(int n){
        if(rev2(n) == n){
            return true;
        }
        return false;
    }
}
