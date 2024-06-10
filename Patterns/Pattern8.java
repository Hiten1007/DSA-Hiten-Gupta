package Patterns;

public class Pattern8 {
    public static void main(String[] args) { pattern8(5); }
    static void pattern8(int n){
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                System.out.print(j >= n - i + 1 && j <= n + i - 1 ? "*" : " ");
            }
            System.out.println();
        }
    }
}
