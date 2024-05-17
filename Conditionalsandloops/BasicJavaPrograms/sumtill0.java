package Conditionalsandloops.BasicJavaPrograms;

import java.util.*;

public class sumtill0 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here : ");

        int num = sc.nextInt();

        while(num != 0){
            sum += num;
            System.out.println("The current sum is : " + sum);
            System.out.print("Enter a number here : ");
            num = sc.nextInt();
        }
    }
}
