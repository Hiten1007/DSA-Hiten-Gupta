package Basics;

import java.util.*;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.next();

        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        for(int i = 0; i < s.length()/2; i++){
            if(arr[left] != arr[right]){
                System.out.print("String is not palindrome");
                System.exit(0);
            }
            right--;
            left++;
        }
        System.out.print("String is palindrome");
    }
}
