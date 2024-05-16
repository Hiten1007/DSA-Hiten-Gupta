package Conditionalsandloops.BasicJavaPrograms;

import java.util.*;

public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length here : ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth here : ");
        int b = sc.nextInt();
        System.out.print("The perimeter of rectangle is : " + 2*( l + b ));
    }
}
