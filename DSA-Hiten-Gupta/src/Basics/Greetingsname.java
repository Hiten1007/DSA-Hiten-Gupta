package Basics;

import java.util.Scanner;

public class Greetingsname {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Welcome " + name);
    }
}
