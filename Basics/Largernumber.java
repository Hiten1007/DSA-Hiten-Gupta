package Basics;

import java.util.*;

public class Largernumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        if(a > b){
            System.out.print(a + " is the larger number");
        }
        else if(a < b){
            System.out.print(b + " is the larger number");
        }
        else{
            System.out.print("Both are equals");
        }
    }
}
