package Patterns;

public class Pattern31 {
    public static void main(String[] args) {
        pattern31(4);
    }
    static void pattern31(int n){
        for(int row = 1; row < 2* n; row++){
            for(int col = 1; col < 2*n;col++){
                int everyidx = n - Math.min(Math.min(row, col), Math.min(2*n - row, 2*n - col)) + 1;
                System.out.print(everyidx);
            }
            System.out.println();
        }
    }
}
