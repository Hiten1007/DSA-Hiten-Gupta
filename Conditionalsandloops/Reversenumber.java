package Conditionalsandloops;

import java.util.*;

public class Reversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here : ");
        int num = sc.nextInt();
        int reversenum = 0;

        while(num != 0){
            int remainder = num % 10;
            reversenum = reversenum*10 + remainder;
            num = num/10;
        }
        System.out.print("The reversed number is : " + reversenum);
    }
}
