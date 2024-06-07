package bitwise;

public class Setithbit {
    public static void main(String[] args) {
        int n = 4;
        int i = 2;
        System.out.println(bit(i, n));
    }
    static int bit(int i, int n){
        return (n | (1<<(i-1)));
    }
}
