package functions;

import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here : ");
        int a = sc.nextInt();
        System.out.print("Enter a number here : ");
        int b = sc.nextInt();
        int sum = sum(a, b);
        System.out.print("The sum is : " +  sum);

    }
    static int sum(int a, int b){
        return a + b;
    }
}
