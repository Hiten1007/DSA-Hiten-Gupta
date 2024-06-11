package Patterns;

public class Pattern11 {
    public static void main(String[] args) { pattern11(5); }

    static void pattern11(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2 * n - 1; j++){
                System.out.print(j >= i && j <= 2 * n - i && ((i + j )& 1) == 0 ? "*" : " ");
            }
            System.out.println();
        }
    }
}
