package bitwise.bitwiseQuestions;

public class NumberComplement {
    public static void main(String[] args) {
        int ans = (int)(Math.pow(2, 31));
        System.out.println(findComplement(ans));
    }
    static int findComplement(int num) {
        String s = Integer.toBinaryString(num);
        int ans = 0;
        int x = 1;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == '0'){
                ans += x;
            }
            x <<= 1;
        }
        return ans;
    }
}
