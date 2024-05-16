package Conditionalsandloops.BasicJavaPrograms;

import java.util.*;

public class AreaParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base here : ");
        int b = sc.nextInt();
        System.out.print("Enter the height here : ");
        int h = sc.nextInt();
        System.out.print("The area of parallelogram is : " + b * h);
    }
}
