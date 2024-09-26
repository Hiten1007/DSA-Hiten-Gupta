package Recursion;

public class CountStepstoReducetoZero {
    public static void main(String[] args) {
        int n = 31;
        System.out.println(numberOfSteps(n));
    }
    static int numberOfSteps(int num) {
        if(num == 0){
            return 0;
        }
        else  if(num%2 == 0){
            return 1 + numberOfSteps(num/2);
        }
        return 1 + numberOfSteps(num - 1);
    }
}
