package functions;

import java.util.*;

public class Gradecard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();
        System.out.print("Your grade is : " + grade(marks));
    }

    static String grade(int marks){
        if(marks >= 91 && marks <= 100){
            return "AA";
        }
        if(marks >= 81 && marks <= 90){
            return "AB";
        }
        if(marks >= 71 && marks <= 80){
            return "BB";
        }
        if(marks >= 61 && marks <= 70){
            return "BC";
        }
        if(marks >= 51 && marks <= 60){
            return "CD";
        }
        if(marks >= 41 && marks <= 50){
            return "DD";
        }
        return "Fail";
    }
}
