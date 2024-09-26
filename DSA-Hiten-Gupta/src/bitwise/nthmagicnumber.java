package bitwise;

public class nthmagicnumber {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(nth(n, 5));
        System.out.println();
    }
    static int nth(int n, int base){
        //base = 5
        int x = base;
        int ans = 0;
        while(n > 0){
            int last = (n & 1);
            ans += last * base;
            base = base * x;
            n >>= 1;
        }
        return ans;
    }
}
