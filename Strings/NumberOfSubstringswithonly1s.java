package Strings;

public class NumberOfSubstringswithonly1s {
    public static void main(String[] args) {
        String s = "01111";
        System.out.println(numSub(s));
    }
    static int numSub(String s) {
        int i = s.length() - 1;
        int ans = 0;
        long n = 0;
        while(i >= 0){
            if((s.charAt(i) & 1) == 1){
                n++;
            }
            else if(i < s.length() - 1 && ((s.charAt(i) - '0') & 1) == 0 && ((s.charAt(i + 1) - '0') & 1) == 1){
                ans += (int) (((n*(n+1))/2) % (1000000000 + 7));
                n = 0;
            }
            i--;
        }
        ans += (int) (((n*(n+1))/2) % (1000000000 + 7));
        return ans;
    }
}
