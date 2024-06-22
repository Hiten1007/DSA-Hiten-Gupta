package Strings;

public class BasicCalculatorII {
    public static void main(String[] args) {
        String s = "78*3333";
        System.out.println(calculate(s));
    }
    static int calculate(String s) {
        int result = 0;
        int currentNum = 0;
        int num = 0;
        char sign = '+';

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                num = num*10 + (c - '0');
            }
            if((!Character.isDigit(c) && c != ' ') || i == s.length() - 1){
                if(sign == '+'){
                    result += currentNum;
                    currentNum = num;
                }
                else if(sign == '-'){
                    result += currentNum;
                    currentNum = -num;
                }
                else if(sign == '*'){
                    currentNum *= num;
                }
                else if(sign == '/'){
                    currentNum /= num;
                }
                sign = c;
                num = 0;
            }
        }
        return result + currentNum;
    }
}
