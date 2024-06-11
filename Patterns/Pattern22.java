package Patterns;

public class Pattern22 {
    public static void main(String[] args) { pattern22(5); }

    static void pattern22(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print((((j+i)& 1) == 0 ? 1 : 0) + " ");
            }
            System.out.println();
        }
    }
}
