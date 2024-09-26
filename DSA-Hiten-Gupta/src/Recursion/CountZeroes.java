package Recursion;

public class CountZeroes {
    public static void main(String[] args) {
        int num = 308760056;
        System.out.println(countzero(num));
    }
    static int countzero(int n){
        if(n%10 == n){
            return n == 0 ? 1 : 0;
        }
        int rem = n % 10;
        if(rem == 0){
            return 1 + countzero(n/10);
        }
        return countzero(n / 10);
    }
}
