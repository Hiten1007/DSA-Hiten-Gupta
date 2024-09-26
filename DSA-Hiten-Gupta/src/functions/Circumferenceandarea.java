package functions;

import java.util.*;

public class Circumferenceandarea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius here : ");
        double r = sc.nextDouble();
        System.out.print("The circumference is : " + circumference(r) + " and the area is " + area(r));
    }

    static double circumference(double r){
        return 2*3.14*r;
    }
    static double area(double r){
        return 3.14*r*r;
    }
}
