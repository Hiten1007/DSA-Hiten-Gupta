package functions;

import java.util.*;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here : ");
        int a = sc.nextInt();
        System.out.print("Enter a number here : ");
        int b = sc.nextInt();
        int product = product(a, b);
        System.out.print("The product is : " +  product);

    }
    static int product(int a, int b){
        return a * b;
    }
}
