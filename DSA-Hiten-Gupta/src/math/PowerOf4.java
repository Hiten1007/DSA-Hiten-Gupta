package math;

public class PowerOf4 {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(-256));
    }
    static boolean isPowerOfFour(int n) {
        if(n == 0) return false;
        int x = n;
        int count = 0;
        while(x > 0){
            x >>= 1;
            count++;
        }
        return (n & (n-1)) == 0 && (count&1) == 1;
    }
}
