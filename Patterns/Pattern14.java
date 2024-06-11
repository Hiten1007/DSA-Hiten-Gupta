package Patterns;

public class Pattern14 {
    public static void main(String[] args) { pattern14(14); }

    static void pattern14(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2 * n - 1; j++){
                System.out.print(j == i || j == 2 * n - i || i == 1? "*" : " ");
            }
            System.out.println();
        }
    }
}
