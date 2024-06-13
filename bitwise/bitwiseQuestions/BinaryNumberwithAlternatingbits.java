package bitwise.bitwiseQuestions;

public class BinaryNumberwithAlternatingbits {
    public static void main(String[] args) {
        int n = 1628;
        System.out.println(hasAlternatingBits(n));
    }
    static boolean hasAlternatingBits(int n) {
        String x = Integer.toBinaryString(n);
        if(x.contains("00") || x.contains("11")){
            return false;
        }
        return true;
    }
}
