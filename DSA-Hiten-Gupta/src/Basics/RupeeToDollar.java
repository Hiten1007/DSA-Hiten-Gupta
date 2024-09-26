package Basics;

import java.util.*;

public class RupeeToDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the money in rupees : ");
        int rupees = sc.nextInt();
        System.out.print("$" + rupees*0.012);
    }
}
