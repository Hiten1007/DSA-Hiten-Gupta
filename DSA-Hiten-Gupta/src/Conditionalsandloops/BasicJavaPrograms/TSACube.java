package Conditionalsandloops.BasicJavaPrograms;

import java.util.*;

public class TSACube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of a cube : ");
        int a = sc.nextInt();
        System.out.print("The total surface area of the cube is : " + 6*a*a*a);
    }
}
