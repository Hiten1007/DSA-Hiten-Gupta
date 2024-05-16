package Basics;

import java.util.*;

public class Armstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here : ");
        int a = sc.nextInt();
        System.out.print("Enter another number here : ");
        int b = sc.nextInt();

        for(int i = a; i < b; i++){
            int originalnum = i;
            int digits = 0;
            int newnum = 0;

            while(originalnum > 0){
                originalnum = originalnum/10;
                digits++;
            }
            originalnum = i;
            while(originalnum > 0){

                int remainder = originalnum%10;
                newnum += (int) Math.pow(remainder, digits);
                originalnum/=10;
            }
            if(newnum == i){
                System.out.println(i +" is an armstrong number");
            }
        }
    }
}
