package Basics;

import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.print("Enter an operator : ");
        char c = sc.next().charAt(0);

        if(c == '+'){
            System.out.print(a+b);
        }
        else if(c == '-'){
            System.out.print(a -b);
        }
        else if(c == '*'){
            System.out.print(a*b);
        }
        else if(c == '/'){
            System.out.print(a/b);
        }
        else{
            System.out.print("Invalid symbol");
        }
    }
}
