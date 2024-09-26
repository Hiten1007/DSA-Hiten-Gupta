package Recursion;

public class NumberOfDiceRollswithTargetSum {
    public static void main(String[] args) {
        int target = 4;
        dicerolls("", target);
    }
    static void dicerolls(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1; i <= 6 && i <= target; i++){
            dicerolls(p + i, target - i);
        }
    }
}
