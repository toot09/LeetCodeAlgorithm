import java.util.*;
//Runtime: 216 ms (out of lange...)
//Memory Usage: 39.8 MB
class WordSearch_TIQ {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(backtracking(board, word, 0, new boolean[board.length][board[0].length], i, j)) return true;
            }
        }
        return false;
    }
    
    public boolean backtracking(char[][] board, String word, int idx, boolean[][] visit, int r, int l) {
        if(r < 0 || l < 0 || r >= visit.length || l >= visit[0].length || idx >= word.length() || board[r][l] != word.charAt(idx)
        || visit[r][l]) {
            return false;
        }
        if(idx == word.length() - 1) return true;
        boolean[][] visitThis = new boolean[visit.length][visit[0].length];
        for(int i = 0; i < visit.length; i++) {
            for(int j = 0; j < visit[0].length; j++) {
                visitThis[i][j] = visit[i][j];
            }
        }
        visitThis[r][l] = true;
        return backtracking(board, word, idx + 1, visitThis, r + 1, l)
        || backtracking(board, word, idx + 1, visitThis, r - 1, l)
        || backtracking(board, word, idx + 1, visitThis, r, l + 1)
        || backtracking(board, word, idx + 1, visitThis, r, l - 1);
    }
    
}