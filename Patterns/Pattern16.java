package Patterns;

public class Pattern16 {
    public static void main(String[] args) { pattern16(5); }

    static void pattern16(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2 * n - 1; j++){
                System.out.print(j >= n - i + 1 && j <= n + i - 1 &&((i + j)&1) == 0 ? (j == n - i + 1 && j == n + i - 1 ? 1 : pascal(i - 1, (j - (n - i + 1))/2 )) : " ");
            }
            System.out.println();
        }
    }

    static int pascal(int row, int col){
        if(col == 0 || col == row){
            return 1;
        }
        return pascal(row - 1, col - 1) + pascal(row - 1, col);
    }
}
