package Patterns;

public class Pattern15 {
    public static void main(String[] args) { pattern15(9); }

    static void pattern15(int n){
        for(int i = 1; i <= 2*n - 1; i++){
            for(int j = 1; j <= 2*n - 1; j++){
                System.out.print(i > n ? (j == (i - n) + 1 || j == 2*n - (i - n) - 1 ? "*" : " ") : (j == n - i + 1 || j == n + i - 1 ? "*" : " "));;
            }
            System.out.println();
        }
    }
}
