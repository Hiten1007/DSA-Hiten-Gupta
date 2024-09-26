package Patterns;

public class Pattern19 {
    public static void main(String[] args) { pattern19(5); }

    static void pattern19(int n){
        for(int i = 1; i <= 2*n - 1; i++){
            for(int j = 1; j <= 2*n; j++){
                System.out.print(i <= n ? (j <= i || j > 2 * n - i ? "*" : " ") : (j <= 2 * n - i || j > i ? "*" : " "));
            }
            System.out.println();
        }
    }
}
