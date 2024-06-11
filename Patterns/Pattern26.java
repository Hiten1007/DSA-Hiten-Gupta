package Patterns;

public class Pattern26 {
    public static void main(String[] args) { pattern26(6); }

    static void pattern26(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print((j <= n - i + 1 ? i : " ") + " ");
            }
            System.out.println();
        }
    }
}
