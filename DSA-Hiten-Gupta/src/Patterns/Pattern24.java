package Patterns;

public class Pattern24 {
    public static void main(String[] args) { pattern24(5); }

    static void pattern24(int n){
        for(int i = 1; i <=2 * n; i++){
            for(int j = 1; j <= 2 * n; j++){
                System.out.print(i <= n ? (j == i || j == 2 * n - i + 1 || j == 1 || j == 2*n ? "*" : " ") : (j == 2 * n - i + 1 || j == i || j == 1 || j == 2*n ? "*" : " "));
            }
            System.out.println();
        }
    }
}
