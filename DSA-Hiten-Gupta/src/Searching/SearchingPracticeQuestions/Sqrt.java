package Searching.SearchingPracticeQuestions;

public class Sqrt {
    public static void main(String[] args) {
        int x = 2147395600;
        System.out.println(mySqrt(x));
    }
    static int mySqrt(int x) {
        long ans = 0;
        for(long i = 0; i*i<= x; i++){
            ans = i;
        }
        return (int)ans;
    }
}
