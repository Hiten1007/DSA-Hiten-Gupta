package functions;

import java.util.*;

public class Pythagoreantriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 number here : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print("The condition of pythagorean triplet is : " + triplet(a, b, c));

    }
    static boolean triplet(int a, int b, int c){
        int h = Math.max(a,Math.max(b,c));
        int p = 0;
        int r = 0;
        if(h == a) {
            p = b;
            r = c;
        }
        if(h == b){
            p = a;
            r = c;
        }
        if(h == c){
            p = a;
            r = b;
        }
        return (h*h)==((p*p)+(r*r));
    }
}
