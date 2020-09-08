import java.util.*;
class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, List<int[]>> hm = new HashMap<>();
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] != '.') {
                    int num = board[i][j] - '0';
                    if(!hm.containsKey(num)) {
                    hm.put(num, new ArrayList());
                } else {
                    for(int[] tmp : hm.get(num)) {
                        if(tmp[0] == i || tmp[1] == j) {
                        return false;
                        }
                        int iStart = (i / 3) * 3;
                        int iEnd = iStart + 3 - 1;
                        int jStart = (j / 3) * 3;
                        int jEnd = jStart + 3 - 1;

                        if((iStart <= tmp[0] && tmp[0] <= iEnd) && (jStart <= tmp[1] && tmp[1] <= jEnd)) {
                            return false;
                        }
                    }
                }
                 hm.get(num).add(new int[]{i, j});
                }
            }
        }
        return true;
    }
}