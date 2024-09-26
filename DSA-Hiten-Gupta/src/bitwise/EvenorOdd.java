package bitwise;

public class EvenorOdd {
    public static void main(String[] args) {
        int n = 679;
        System.out.println(odd(n));
    }
    static boolean odd(int n){
        return (n&1)==1;
    }
}
