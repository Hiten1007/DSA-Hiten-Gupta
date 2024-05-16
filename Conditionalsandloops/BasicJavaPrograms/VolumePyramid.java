package Conditionalsandloops.BasicJavaPrograms;

import java.util.*;

public class VolumePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base area of the pyramid : ");
        int area = sc.nextInt();
        System.out.print("Enter the height of the pyramid : ");
        int height = sc.nextInt();
        System.out.print("The volume of the pyramid is : " + (area * height)/3);
    }
}
