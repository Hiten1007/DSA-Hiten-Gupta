package Patterns;

public class Pattern18 {
    public static void main(String[] args) { pattern18(18); }
    static void pattern18(int n){
        for(int i = 1; i <= 2 * n; i++){
            for(int j = 1; j <= 2 * n; j++){
                System.out.print(i <= n ? (j > n - i + 1 && j < n + i && i != 1? " " : "*") : (j > i - n && j <= 2*n - (i - n) && i!= 2*n ? " " : "*"));
            }
            System.out.println();
        }
    }
}
