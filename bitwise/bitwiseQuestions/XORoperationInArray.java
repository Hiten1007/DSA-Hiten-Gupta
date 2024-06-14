package bitwise.bitwiseQuestions;

public class XORoperationInArray {
    public static void main(String[] args) {
        int n = 5;
        int start = 0;
        System.out.println(xorOperation(n, start));
    }
    static int xorOperation(int n, int start) {
        int ans = start;
        for(int i = 1; i < n; i++){
            ans ^= start + 2 * i;
        }
        return ans;
    }
}
