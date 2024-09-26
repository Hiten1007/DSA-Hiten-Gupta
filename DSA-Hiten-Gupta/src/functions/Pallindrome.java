package functions;

import java.util.*;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here : ");
        int n = sc.nextInt();
        System.out.print(Pallindromenum(n));
    }
    static boolean Pallindromenum(int n){
        int originalnum = n;
        int reversenum = 0;
        while(originalnum > 0){
            reversenum = (reversenum*10) + (originalnum % 10);
            originalnum/=10;
        }
        return n == reversenum;
    }
}
