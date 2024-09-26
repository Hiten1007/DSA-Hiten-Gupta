package Patterns;

public class Pattern12 {
    public static void main(String[] args) { pattern12(7); }
    static void pattern12(int n){
        for(int i = 1; i <= 2*n; i++){
            for(int j = 1; j <= 2*n - 1; j++){
                if(i > n){
                    System.out.print(j >= n - (i - n) + 1 && j <= n + (i - n) - 1 && ((i+j) & 1) == 1 ? "*" : " " );
                }
                else{
                    System.out.print(j >= i && j <= 2 * n - i && ((i+j) & 1) == 0 ? "*" : " ");
                }
            }
            System.out.println();
        }
    }
}
