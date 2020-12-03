// Difficulty : Medium
class RangeSumQuery2DImmutable_category {

    private int[][] dp;
    
    public void NumMatrix(int[][] matrix) {
        if(matrix.length==0) return;
        int m = matrix.length, n = matrix[0].length;
        dp = new int[m][n];
        for(int i=0 ; i<m ; i++) {
            for(int j=0 ; j<n ; j++) {
                dp[i][j] = matrix[i][j];
                if(i==0 && j==0) continue;
                if(i==0) {
                    dp[i][j] += dp[i][j-1];
                } else if(j==0) {
                    dp[i][j] += dp[i-1][j];
                } else {
                    dp[i][j] += (dp[i][j-1] + dp[i-1][j] - dp[i-1][j-1]);
                }
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return dp[row2][col2] - (col1>0?dp[row2][col1-1]:0) - (row1>0?dp[row1-1][col2]:0) + (row1>0 && col1>0 ? dp[row1-1][col1-1]:0);
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */