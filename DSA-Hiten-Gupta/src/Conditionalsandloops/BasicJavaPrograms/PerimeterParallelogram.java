package Conditionalsandloops.BasicJavaPrograms;

import java.util.*;

public class PerimeterParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length here : ");
        int a = sc.nextInt();
        System.out.print("Enter the breadth here : ");
        int b = sc.nextInt();
        System.out.print("The perimeter of the parallelogram : " +  2*(a + b));
    }
}
