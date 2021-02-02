// 85. Maximal Rectangle
// Difficulty : Hard
// Comment : I did it
// url : https://leetcode.com/problems/maximal-rectangle/
class MaximalRectangle_category {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0) return 0;
        int r=matrix.length, l=matrix[0].length, ret=0;
        int[][] dp = new int[r][l];
        for(int i=0 ; i<r ; i++) {
            for(int j=0 ; j<l ; j++) {
                if(matrix[i][j]=='1') {
                    dp[i][j] = (j-1<0?0:dp[i][j-1]) + 1;
                    int len = Integer.MAX_VALUE;
                    for(int k=1 ; i-k+1>=0 && matrix[i-k+1][j]=='1' ; k++) {
                        len = Math.min(len, dp[i-k+1][j]);
                        ret = Math.max(ret, len*k);
                    }
                }
            }
        }
        return ret;
    }
}