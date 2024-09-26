package Conditionalsandloops.BasicJavaPrograms;

import java.util.*;

public class areaequilateraltraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the triangle here : ");
        int a = sc.nextInt();
        System.out.print("The area of the equilateral triangle is : " + (Math.sqrt(3) * a * a)/ 4);
    }
}
