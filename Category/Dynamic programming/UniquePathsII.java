// Difficulty : Medium
// Have to arrange but 100% efficient code
class UniquePathsII_category {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0]==1) return 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for(int i=0 ; i<m ; i++) {
            for(int j=0 ; j<n ; j++) {
                if((j==0 && i==0) || obstacleGrid[i][j]==1) continue;
                if(i==0 || j==0) {
                if((i==0 && dp[i][j-1]!=0) || (j==0 && dp[i-1][j]!=0)) dp[i][j] = 1;
                } else dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}