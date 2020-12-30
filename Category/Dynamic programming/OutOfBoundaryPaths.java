// Difficulty : Medium
// Comment : 1. Definite temporary DP.
//           2. Next step is not dulicate (Next step didn't next step's step)
// url : https://leetcode.com/problems/out-of-boundary-paths/
class OutOfBoundaryPaths_category {
    public int findPaths(int m, int n, int N, int i, int j) {
        int[][] dp = new int[m][n];
        dp[i][j] = 1;
        int div = 1000000000+7;
        int ret = 0;            
        for(int len=1 ; len<=N ; len++) {
            int[][] tmp = new int[m][n];
            for(int x=0 ; x<m ; x++) {
                for(int y=0 ; y<n ; y++) {
                    if(x-1>=0) {
                        tmp[x-1][y] = (tmp[x-1][y]+dp[x][y]) % div;
                    } else {
                        ret = (ret + dp[x][y])%div;
                    }
                    if(x+1<m) {
                        tmp[x+1][y] = (tmp[x+1][y]+dp[x][y]) % div;
                    } else {
                        ret = (ret + dp[x][y])%div;
                    }
                    if(y-1>=0) {
                        tmp[x][y-1] = (tmp[x][y-1]+dp[x][y]) % div;
                    } else {
                        ret = (ret + dp[x][y])%div;
                    }
                    if(y+1<n) {
                        tmp[x][y+1] = (tmp[x][y+1]+dp[x][y]) % div;
                    } else {
                        ret = (ret + dp[x][y])%div;
                    }
                }
            }
            dp = tmp;
        }
        return ret;
    }
}