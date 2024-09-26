package bitwise;

public class numberofdigits {
    public static void main(String[] args) {
        int number  = 16;
        int base = 2;
        System.out.println(digits(number, base));
    }
    static int digits(int number, int base){
        return (int)(1 + (Math.log(number)/ Math.log(base)));
    }
}
