package Conditionalsandloops.BasicJavaPrograms;

import java.util.*;

public class subtractProductAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here : ");
        int num = sc.nextInt();

        int product = 1;
        int sum = 0;

        while(num > 0){
            sum = sum + (num % 10);
            product = product * (num % 10);
            num = num / 10;
        }
        System.out.print("The answer is : " + (product - sum));

    }
}
