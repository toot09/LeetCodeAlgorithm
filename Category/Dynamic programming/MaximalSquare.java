// Difficulty : Medium
// First Try!
// this code is not best answer but im satisfied.
class MaximalSquare_category {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int ret = 0;
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                dp[i][j] = matrix[i][j] - '0';
                if(i>0 && j>0 && dp[i][j]>0) {
                    int min = Math.min(dp[i-1][j], dp[i][j-1]);
                    min = Math.min(min, dp[i-1][j-1]);
                    dp[i][j] = min+1;
                }
                ret = Math.max(ret, dp[i][j]);
            }
        }
        return ret * ret;
    }
}