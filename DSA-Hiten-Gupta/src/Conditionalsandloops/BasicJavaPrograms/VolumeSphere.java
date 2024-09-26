package Conditionalsandloops.BasicJavaPrograms;

import java.util.*;

public class VolumeSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius here : ");
        int r = sc.nextInt();
        System.out.print("The volume of the sphere is : " + (4*3.14*r*r*r)/3);
    }
}
