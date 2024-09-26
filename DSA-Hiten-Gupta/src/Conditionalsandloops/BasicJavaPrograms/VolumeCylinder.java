package Conditionalsandloops.BasicJavaPrograms;

import java.util.*;

public class VolumeCylinder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the cylinder : ");
        int h = sc.nextInt();
        System.out.print("Enter the radius of the cylinder : ");
        int r = sc.nextInt();
        System.out.print("The volume of the cylinder is : " + 3.14 * r * r * h);
    }
}

