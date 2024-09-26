package functions;

import java.util.*;

public class Primenumbersrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting range : ");
        int a = sc.nextInt();
        System.out.print("Enter the ending range : ");
        int b = sc.nextInt();
        for(int i = a; i < b; i++) {
            if(isPrime(i)){
                System.out.print(" " + i);
            }
        }
    }
    static boolean isPrime(int n){
        if(n<=1) {
            return false;
        }
        int c = 2;
        while(c*c <= n){
            if((n % c) == 0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }
}
