package functions;

import java.util.*;

public class maxandmin {
    static int max(int a, int b, int c){
        int max = a;
        if(b>max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        return max;
    }

    static int min(int a, int b, int c){
        int min = a;
        if(min > b){
            min = b;
        }
        if(min > c){
            min = c;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here : ");
        int a = sc.nextInt();
        System.out.print("Enter a number here : ");
        int b = sc.nextInt();
        System.out.print("Enter a number here : ");
        int c = sc.nextInt();
        int max = max(a, b, c);
        int min = min(a, b, c);
        System.out.println("The maximum value is : " + max);
        System.out.print("The minimum value is : " + min);
    }
}
