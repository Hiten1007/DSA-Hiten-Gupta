package bitwise.bitwiseQuestions;

public class ReverseBits {
    public static void main(String[] args) {
    }
    static int reverseBits(int n) {
        int ans = 0;
        for(int i = 0; i < 32; i++){
            ans <<= 1;
            ans |= (n & 1);
            n >>= 1;
        }
        return ans;
    }
}