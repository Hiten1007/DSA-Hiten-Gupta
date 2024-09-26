package bitwise;

public class powfunction {
    public static void main(String[] args) {
        int number = 0;
        int power = 4;
        System.out.println(pow(number, power));
    }
    static int pow(int n, int power){
        int ans = 1;
        while(power > 0){
            if((power&1) == 1){
                ans *= n;
            }
            n*=n;
            power >>= 1;
        }
        return ans;
    }
}
