package Recursion;

public class SumandProductofDigits {
    public static void main(String[] args) {
        int num = 1342;
        int sum = sum(num);
        int product = product(num);
        System.out.println(sum);
        System.out.println(product);
    }
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n%10 + sum(n/10);
    }
    static int product(int n){
        if(n%10 == n){
            return n;
        }
        return n%10 * product(n/10);
    }
}
