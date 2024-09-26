package math;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        int left = 48;
        int right = 128;
        System.out.println(selfDividingNumbers(left, right));
    }
    static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++) {
            if (selfDividing(i)) {
                list.add(i);
            }
        }
        return list;
    }
    static boolean selfDividing(int num){
        int n = num;
        while(n > 0){
            int remainder = n % 10;
            if(remainder == 0) return false;
            if(num % remainder != 0){
                return false;
            }
            n/= 10;
        }
        return true;
    }
}
