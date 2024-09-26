package Basics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal here : ");
        int P = sc.nextInt();
        System.out.print("Enter rate here : ");
        int R = sc.nextInt();
        System.out.print("Enter time here : ");
        int T = sc.nextInt();

        int simple_interest = ( P * R * T )/100;
        System.out.println("The simple interest is : " + simple_interest);
    }
}
