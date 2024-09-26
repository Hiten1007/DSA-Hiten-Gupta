package Conditionalsandloops.BasicJavaPrograms;

import java.util.*;

public class AreaRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of a diagonal here : ");
        int d1 = sc.nextInt();
        System.out.print("Enter the length of the second diagonal here : ");
        int d2 = sc.nextInt();
        System.out.print("The area of the rhombus is : " + (d1*d2)/2 );
    }
}
