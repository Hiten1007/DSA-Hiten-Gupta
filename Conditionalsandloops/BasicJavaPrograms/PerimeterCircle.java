package Conditionalsandloops.BasicJavaPrograms;

import javax.sound.midi.SysexMessage;
import java.util.*;

public class PerimeterCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle here : ");
        int r = sc.nextInt();
        System.out.print("The perimeter of the circle is : " + 2 * 3.14 * r);
    }
}
