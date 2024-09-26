package functions;

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here : ");
        int n = sc.nextInt();
        System.out.print("The factorial of " + n + " is : " + factorial(n));
    }
    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
