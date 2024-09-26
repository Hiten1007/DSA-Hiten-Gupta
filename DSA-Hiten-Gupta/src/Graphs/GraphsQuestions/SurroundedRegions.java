package Graphs.GraphsQuestions;

import java.util.Arrays;

public class SurroundedRegions {
    public static void main(String[] args) {
        String[][] board = {
                {"O","X","X","O","X"},
                {"X","O","O","X","O"},
                {"X","O","X","O","X"},
                {"O","X","O","O","O"},
                {"X","X","O","X","O"}};
        solve(board);
        for(String[] arr : board){
            System.out.println(Arrays.toString(arr));
        }
    }
    static void solve(String[][] board) {
        int n = board.length;
        int m = board[0].length;
        int[] delR = {0, 1, 0, -1};
        int[] delC = {1, 0, -1, 0};
        int[][] vis = new int[n][m];
        for(int i = 0; i < n; i++){
            if(board[i][0] == "O" && vis[i][0] == 0){
                dfs(i, 0, board, delC, delR, vis);
            }
            if(board[i][m - 1] == "O" && vis[i][m - 1] == 0){
                dfs(i,  m - 1, board, delC, delR, vis);
            }
        }
        for(int i = 0; i < m; i++){
            if(board[0][i] == "O" && vis[0][i] == 0){
                dfs(0, i, board, delC, delR, vis);
            }
            if(board[n - 1][i] == "O" && vis[n - 1][i] == 0){
                dfs(n - 1,  i, board, delC, delR, vis);
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(vis[i][j] == 0 && board[i][j] == "O"){
                    board[i][j] = "X";
                }
            }
        }
    }
    static void dfs(int i, int j, String[][] board, int[] delC, int[] delR, int[][] vis){
        vis[i][j] = 1;
        int n = board.length;
        int m = board[0].length;
        for(int k = 0; k < 4; k++) {
            int nR = i + delR[k];
            int nC = j + delC[k];
            if (nR >= 0 && nC >= 0 && nR < n && nC < m && board[nR][nC] == "O" && vis[nR][nC] == 0) {
                dfs(nR, nC, board, delC, delR, vis);
            }
        }
    }
}
