package Recursion;

public class FactorialandSum {
    public static void main(String[] args) {
        int fact = fact(5);
        int sum = sum(5);
        System.out.println(fact);
        System.out.println(sum);
    }
    static int fact(int n){
        if( n == 1 || n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
    static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n - 1);
    }
}
