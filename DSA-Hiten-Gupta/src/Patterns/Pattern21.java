package Patterns;

public class Pattern21 {
    public static void main(String[] args) { pattern20(5); }

    static void pattern20(int n){
        int ans = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(ans++ + " ");
            }
            System.out.println();
        }
    }
}
