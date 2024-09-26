package Conditionalsandloops.BasicJavaPrograms;

import java.util.*;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length here : ");
        int l = sc.nextInt();
        System.out.print("Enter breadth here : ");
        int b = sc.nextInt();
        System.out.print("The area of the rectangle is : " + l * b);
    }
}
