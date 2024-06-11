package Patterns;

public class Pattern35 {
    public static void main(String[] args) { pattern35(4); }

    static void pattern35(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2*n; j++){
                System.out.print(j <= i || j > 2 * n - i ? (j <= i ? j : 2 * n - j + 1) : " ");
            }
            System.out.println();
        }
    }
}
