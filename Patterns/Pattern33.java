package Patterns;

public class Pattern33 {
    public static void main(String[] args) { pattern33(5); }

    static void pattern33(int n){
        char a = 'a';
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print((((i + j)&1) == 0 ? (char)(a++) : (char)(a++ - 32)) + " ");
            }
            System.out.println();
        }
    }
}
