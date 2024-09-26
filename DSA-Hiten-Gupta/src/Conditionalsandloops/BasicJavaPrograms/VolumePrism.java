package Conditionalsandloops.BasicJavaPrograms;

import java.util.*;

public class VolumePrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base area of prism : ");
        int area = sc.nextInt();
        System.out.print("Enter the height of the prism here : ");
        int height = sc.nextInt();
        System.out.print("Volume of the prism is : " +  area * height);
    }
}
