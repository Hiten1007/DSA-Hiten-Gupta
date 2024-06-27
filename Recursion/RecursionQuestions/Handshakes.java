package Recursion.RecursionQuestions;

public class Handshakes {
    public static void main(String[] args) {
        long n = 1156;
        System.out.println(count(n));
    }
    static long ncr(long n, long r)
    {
        long ans = 1;
        for(int i = 0; i < r; i++)
        {
            ans *= n-i;
            ans /= i+1;
        }
        return ans;
    }

    static long count(long N)
    {
        // code here
        if(N%2!=0)
            return 0;
        return ncr(N, N/2) / (N/2 + 1);
    }
}
