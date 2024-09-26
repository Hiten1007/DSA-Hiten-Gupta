package Searching.SearchingPracticeQuestions;

public class ReachaNumber {
    public static void main(String[] args) {
        int target = 760;
        System.out.println(reachNumber(target));
    }
    static int reachNumber(int target) {
        target = Math.abs(target);
        int step = 0;
        int sum = 0;
        while(sum < target){
            step++;
            sum+=step;
        }
        while((sum - target) % 2 == 0){
            step++;
            sum+=step;
        }
        return step;
    }
}
