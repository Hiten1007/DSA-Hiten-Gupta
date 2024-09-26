package Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }
    static void pattern5(int n){
        for(int row = 0; row < 2*n; row++){
            int totalcolsinrows = row < n ? row : 2 * n - row;
            for(int col = 0; col < totalcolsinrows; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
