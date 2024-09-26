package Patterns;

public class Pattern32 {
    public static void main(String[] args) { pattern32(5); }

    static void pattern32(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= i; j++){
                System.out.print((char)('A' + n - i + j - 1) + " ");
            }
            System.out.println();
        }
    }
}
