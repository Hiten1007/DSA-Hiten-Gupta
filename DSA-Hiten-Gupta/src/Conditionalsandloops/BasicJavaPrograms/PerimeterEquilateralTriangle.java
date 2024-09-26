package Conditionalsandloops.BasicJavaPrograms;

import java.util.*;

public class PerimeterEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of equilateral triangle : ");
        int s = sc.nextInt();
        System.out.print("The perimeter of the equilateral triangle is : " + 3 * s);
    }
}
