package Conditionalsandloops;

import java.util.*;

public class Casecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet : ");
        char c = sc.next().charAt(0);
        if(c >= 65 && c <= 90){
            System.out.print(c + " is an uppercase character");
        }
        else if(c >= 97 && c <= 122){
            System.out.print(c + " is a lowercase character");
        }
        else{
            System.out.print(c + " is not an alphabet");
        }
    }
}
