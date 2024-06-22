package Strings;

public class CountNumberOfHomogeneousSubstrings {
    public static void main(String[] args) {
        String s = "abbcccaaa";
        System.out.println(countHomogenous(s));
    }
    static int countHomogenous(String s) {
        if(s.length() <= 1) return 1;
        int i = s.length() - 2;
        long n = 1;
        int ans = 0;
        char cur = s.charAt(s.length() - 1);
        while(i >= 0){
            if(cur == s.charAt(i)){
                n++;
            }
            else if(cur != s.charAt(i)){
                ans += (int) (((n*(n + 1))/2) % (1000000000 + 7));
                n = 1;
                cur = s.charAt(i);
            }
            i--;
        }
        ans += (int) (((n*(n + 1))/2) % (1000000000 + 7));
        return ans;
    }
}
