package Patterns;

public class Pattern20 {
    public static void main(String[] args) { pattern20(4); }

    static void pattern20(int n){
        for(int i = 1; i <= n + 1; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(j == 1 || j == n || i == 1 || i == n + 1 ? "*" : " ");
            }
            System.out.println();
        }
    }
}
