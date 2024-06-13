package bitwise.bitwiseQuestions;

public class Numberof1bits {
    public static void main(String[] args) {
        int x = 24;
        System.out.println(hammingWeight(x));
    }
    static int hammingWeight(int n) {
        int count = 0;
        while(n > 0){
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}
