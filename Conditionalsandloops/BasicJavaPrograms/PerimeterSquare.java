package Conditionalsandloops.BasicJavaPrograms;

import java.util.*;

public class PerimeterSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the side here : ");
        int a = sc.nextInt();
        System.out.print("The perimeter of the square is : " +  4*a);
    }
}
