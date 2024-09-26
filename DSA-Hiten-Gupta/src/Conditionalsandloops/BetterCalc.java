package Conditionalsandloops;

import java.util.*;

public class BetterCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;

        while(true){
            System.out.print("Enter a operator here : ");
            char op = sc.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/'){
                System.out.print("Enter first operand : ");
                int num1 = sc.nextInt();
                System.out.print("Enter second operand : ");
                int num2 = sc.nextInt();
                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1*num2;
                }
                if(op == '/'){
                    if( num2 != 0 ){
                        ans = num1/num2;
                    }
                }
                System.out.println(ans);
            }
            else if(op =='x'|| op == 'X'){
                System.out.println("Exiting the program");
                System.exit(0);
            }
            else{
                System.out.println("Invalid operator");
            }
        }
    }
}
