package Conditionalsandloops.BasicJavaPrograms;

import java.util.*;

public class CSACylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius here : ");
        int r = sc.nextInt();
        System.out.print("Enter the height here : ");
        int h = sc.nextInt();
        System.out.print("The curved surface area of cylinder is : " + (2 * 3.14 * r * h));
    }
}
