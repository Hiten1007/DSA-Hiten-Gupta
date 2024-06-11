package Patterns;

public class Pattern34 {
    public static void main(String[] args) { pattern34(5); }

    static void pattern34(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print((j <= n - i + 1 ? (char)('A' + n - i - j + 1) : " ") + " ") ;
            }
            System.out.println();
        }
    }
}
