package functions;

import java.util.*;

public class Sumnaturalnum {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.print("Enter the number here : ");
        int n = sc.nextInt();
        System.out.print("The sum of first " + n + " natural numbers is : " + sum(n));
    }
    static int sum(int n){
        if(n == 1) return 1;

        return n + sum(n - 1);
    }
}
