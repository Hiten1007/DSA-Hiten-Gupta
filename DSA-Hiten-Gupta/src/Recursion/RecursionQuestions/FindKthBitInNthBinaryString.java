package Recursion.RecursionQuestions;

public class FindKthBitInNthBinaryString {
    public static void main(String[] args) {
        int n = 4;
        int k = 3;
        System.out.println(findKthBit(n, k));
    }

    static char findKthBit(int n, int k) {
        if(n == 1){
            return '0';
        }
        int cols = (int)(Math.pow(2, n) - 1);
        int mid = cols/2;

        if(k <= mid){
            return findKthBit(n - 1, k);
        }
        else if(k == mid + 1){
            return '1';
        }
        else{
            k = cols - k + 1;
            char c = findKthBit(n- 1, k);
            return c == '0' ? '1' : '0';
        }

 /*       String s1 = "0";
        String p = helper(s1, n);
        System.out.println(p);
        return p.charAt(k - 1);
    }
    static String helper(String s1, int n){
        if(n == 1){
            return s1;
        }
        String s2 = reverseInverse(s1);
        s1 = s1 + "1" + s2;

        return helper(s1, n - 1);
    }
    static String reverseInverse(String s){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1'){
                builder.append("0");
            }
            else{
                builder.append("1");
            }
        }
        return builder.reverse().toString(); */
    }
}
