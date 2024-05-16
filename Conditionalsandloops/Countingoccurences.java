package Conditionalsandloops;

import java.util.*;

public class Countingoccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here : ");
        int x = sc.nextInt();
        System.out.print("Enter a digit you want to find the occurence of : ");
        int y = sc.nextInt();
        int count = 0;

        while(x > 0){
            int z = x % 10;
            if( z == y){
                count++;
            }
            x = x/10;
        }

        System.out.print(count);
    }
}
