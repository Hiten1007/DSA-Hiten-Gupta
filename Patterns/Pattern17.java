package Patterns;

public class Pattern17 {
    public static void main(String[] args) {
        pattern17(4);
    }
    static void pattern17(int n){
        for(int row = 1; row <= 2*n - 1; row++){
            int totalcols = row <= n ? row : 2*n - row;
            int spaces = n - totalcols;
            for(int s = 1; s <= spaces; s++){
                System.out.print(" ");
            }
            for(int col = totalcols; col >= 1; col--){
                System.out.print(col);
            }
            for(int col = 2; col <= totalcols; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
