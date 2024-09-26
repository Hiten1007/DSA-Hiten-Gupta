package Conditionalsandloops.BasicJavaPrograms;

import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms here : ");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;

        if(n == 1){
            System.out.print(first);
            System.exit(0);
        }

        System.out.print(first + " " + second + " ");

        int res = 0;
        for (int i = 2; i < n; i++) {
            res = first + second;
            System.out.print(res + " ");
            first = second;
            second = res;
        }
    }
}
