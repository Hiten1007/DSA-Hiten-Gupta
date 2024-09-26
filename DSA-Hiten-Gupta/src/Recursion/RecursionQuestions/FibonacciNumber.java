package Recursion.RecursionQuestions;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(8));
    }
    static int fib(int n) {
        if(n <= 1){
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
