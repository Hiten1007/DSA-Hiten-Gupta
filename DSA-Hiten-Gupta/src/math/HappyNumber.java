package math;

public class HappyNumber {
    public static void main(String[] args) {

    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while(fast != slow){
            fast = squareSum(squareSum(n));
            slow = squareSum(n);
        }
        return true;
    }
    static int squareSum(int n){
        return 0;
    }
}
