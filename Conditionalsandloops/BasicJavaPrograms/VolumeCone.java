package Conditionalsandloops.BasicJavaPrograms;

import java.util.*;

public class VolumeCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the cone : ");
        int h = sc.nextInt();
        System.out.print("Enter the radius of the cone : ");
        int r = sc.nextInt();
        System.out.print("The volume of the cone is : " + (3.14 * r * r * h)/3);
    }
}
