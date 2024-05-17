package functions;

import java.util.*;

public class EligibleVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age here : ");
        int age = sc.nextInt();
        System.out.print(eligible(age));
    }

    static boolean eligible(int age){
        return age >= 18;
    }
}
