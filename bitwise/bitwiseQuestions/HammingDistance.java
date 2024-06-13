package bitwise.bitwiseQuestions;

public class HammingDistance {
    public static void main(String[] args) {
        int x = 12;
        int y = 10;
        System.out.println(hammingDistance(x, y));
    }
    static int hammingDistance(int x, int y) {
        int a = x ^ y;
        int count = 0;
        while(a > 0){
            a = a & (a - 1);
            count++;
        }
        return count;
    }
}
