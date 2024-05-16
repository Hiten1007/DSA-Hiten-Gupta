package Conditionalsandloops.BasicJavaPrograms;

import java.util.*;

public class AreaIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the equal side of the triangle here : ");
        float a = sc.nextFloat();
        System.out.print("Enter the length of base here : ");
        float b = sc.nextFloat();
        double area = 0.5 * b * Math.sqrt( (a*a) - ((b*b)/4));
        System.out.print("The area of isosceles triangle is : " + area);
    }
}
