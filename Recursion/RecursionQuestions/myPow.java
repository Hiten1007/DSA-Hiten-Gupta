package Recursion.RecursionQuestions;

public class myPow {
    public static void main(String[] args) {
        System.out.println(myPow(2, 4));
    }
    static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double a = x;
        if(n < 0 && a!=1/x){
            a = 1/x;
        }
        double temp = myPow(x, n / 2);
        if (n % 2 == 0) {
            return (temp * temp);
        } else {
            return (a * temp * temp);
        }
    }
}
