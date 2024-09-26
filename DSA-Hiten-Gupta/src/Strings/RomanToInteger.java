package Strings;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
    static int romanToInt(String s) {
        int[] arr = new int[s.length()];
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'I'){
                arr[i] = 1;
            }
            if(s.charAt(i) == 'V'){
                arr[i] = 5;
            }
            if(s.charAt(i) == 'X'){
                arr[i] = 10;
            }
            if(s.charAt(i) == 'L'){
                arr[i] = 50;
            }
            if(s.charAt(i) == 'C'){
                arr[i] = 100;
            }
            if(s.charAt(i) == 'D'){
                arr[i] = 500;
            }
            if(s.charAt(i) == 'M'){
                arr[i] = 1000;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                if (s.charAt(i) == 'I' && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                    ans += arr[i + 1] - arr[i];
                    i = i + 1;
                    if(i == arr.length - 1) break;
                } else if (s.charAt(i) == 'X' && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                    ans += arr[i + 1] - arr[i];
                    i = i + 1;
                    if(i == arr.length - 1) break;
                } else if (s.charAt(i) == 'C' && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                    ans += arr[i + 1] - arr[i];
                    i = i + 1;
                    if(i == arr.length - 1) break;
                }
                else {
                    ans+= arr[i];
                }
            }
            if(i == arr.length - 1){
                ans += arr[i];
                break;
            }
        }
        return ans;
    }
}
