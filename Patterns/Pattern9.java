package Patterns;

public class Pattern9 {
    public static void main(String[] args) { pattern9(5); }

    static void pattern9(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2*n - 1; j++){
                System.out.print(j >= i && j <= 2 * n - i ? "*" : " ");
            }
            System.out.println();
        }
    }
}
