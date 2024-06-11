package Patterns;

public class Pattern13 {
    public static void main(String[] args) { pattern13(8); }
    static void pattern13(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2 * n - 1; j++){
                System.out.print(j == n - i + 1 || j == n + i - 1 || i == n ? "*" : " ");
            }
            System.out.println();
        }
    }
}
