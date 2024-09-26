package Searching.SearchingPracticeQuestions;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(389274874));
    }
    static boolean isPerfectSquare(int num) {
        if(num==1) return true;
        long low=0,high=num/2;
        while(low<=high){
            long mid = low +(high-low)/2;

            if(mid*mid==num) return true;
            else if(mid*mid<num) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
}
