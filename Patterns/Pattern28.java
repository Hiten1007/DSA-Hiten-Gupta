package Patterns;

public class Pattern28 {
    public static void main(String[] args) {
        pattern28(5);
    }
    static void pattern28(int n){
        for(int row = 0; row < 2 * n; row++){
            int totalcolsinrows = row < n ? row : 2 * n - row;

            int spaces = n - totalcolsinrows;
            for(int s = 0; s < spaces; s++){
                System.out.print(" ");
            }
            for(int col = 0; col < totalcolsinrows; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
