package Conditionalsandloops.BasicJavaPrograms;

import java.util.*;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.print("The factors of "+ num + " are : ");
        for(int i = 1; i <= num/2; i++){
            if((num % i) == 0){
                System.out.print(i + " ");
            }
        }
        System.out.print(num);
    }
}
