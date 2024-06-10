package Patterns;

public class Pattern6 {
    public static void main(String[] args) { pattern6(5); }

    static void pattern6(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(j <= n - i ? " " : "*");
            }
            System.out.println();
        }
    }
}
