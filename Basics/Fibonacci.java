package Basics;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter number of terms : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0) {
            System.out.print(0);
        }
        else if(n == 1){
            System.out.print(0 + " " + 1);
        }
        else{
            System.out.print("The"+ n + "terms are : ");
            int first = 0;
            int second = 1;
            System.out.print(first + " " + second + " ");


            int res = 0;
            for(int i = 2; i < n; i++){
                res = first + second;
                System.out.print(res + " ");
                first = second;
                second = res;
            }
        }
    }
}
