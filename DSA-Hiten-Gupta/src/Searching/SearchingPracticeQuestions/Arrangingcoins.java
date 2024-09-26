package Searching.SearchingPracticeQuestions;

public class Arrangingcoins {
    public static void main(String[] args) {
        int n = 872362787;
        System.out.println(arrangeCoins(n));
    }
    static int arrangeCoins(int n) {
        return (int)((Math.sqrt(1+8*(double)n)-1)/2);
    }
}
