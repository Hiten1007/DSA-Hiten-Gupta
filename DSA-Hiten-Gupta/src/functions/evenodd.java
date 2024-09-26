package functions;

import java.util.*;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here : ");
        int num = sc.nextInt();
        String ans = evenorodd(num);
        System.out.print(ans);
    }

    static String evenorodd(int n){
        if( (n & 1) == 0 ){
            return "Even";
        }
        return "Odd";
    }
}
