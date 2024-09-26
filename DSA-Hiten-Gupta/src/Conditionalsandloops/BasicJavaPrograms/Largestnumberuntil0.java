package Conditionalsandloops.BasicJavaPrograms;

import java.util.*;

public class Largestnumberuntil0 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here : ");
        int num = sc.nextInt();
        int max = num;

        while(num!=0) {
            if(num > max){
                max = num;
            }
            System.out.println("The current largest number entered is : " + max);

            System.out.print("Enter a number here : ");
            num = sc.nextInt();
        }
    }
}
