package Recursion.RecursionQuestions;

public class WordTarget {
    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C'},
                {'S', 'L', 'O'},
                {'W', 'O', 'N'}};
        String word = "LOW";
        System.out.println(exist(board, word));
    }
   static boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        boolean[][] visited = new boolean[n][m];
        boolean result = false;
        for(int i = 0; i < n; i++){
            for(int j = 0;j < m; j++){
                if(board[i][j] == word.charAt(0)){
                    result = helper(board, word, visited, i, j, 0);
                   if (result) return true;
                }
            }
        }
        return false;
   }
   static boolean helper(char[][] board, String word, boolean[][] visited, int r, int c, int i){
        if(i == word.length()){
            return true;
        }
        if(r < 0 || r >= board.length || c < 0 || c >= board[0].length || visited[r][c] || board[r][c] != word.charAt(i)){
            return false;
        }

        visited[r][c] = true;

        if(helper(board, word, visited, r, c + 1, i + 1) ||
                helper(board, word, visited, r + 1, c, i + 1) ||
                helper(board, word, visited, r - 1, c, i + 1) ||
                helper(board, word, visited, r, c - 1, i + 1)){
            return true;
        }
        visited[r][c] = false;
        return false;
   }
}
