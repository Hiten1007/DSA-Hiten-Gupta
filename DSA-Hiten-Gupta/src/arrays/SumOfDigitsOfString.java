package arrays;

import static java.lang.Integer.parseInt;
import java.util.Queue;
public class SumOfDigitsOfString {
    public static void main(String[] args) {
        String s = "jfdhg";
        int k = 4;
        System.out.println(getLucky(s, k));
    }
    static int getLucky(String s, int k) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            str.append((s.charAt(i) - 96));
        }
        int x = 0;
        while(k != 0) {
            for (int i = 0; i < str.length(); i++) {
                x += str.charAt(i) - '0';
            }
            str = new StringBuilder();
            str.append(x);
            if(x < 10){
                return x;
            }
            x = 0;
            k--;
        }

        return parseInt(str.toString());
    }
}
