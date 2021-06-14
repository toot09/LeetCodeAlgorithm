// Difficulty : Easy
// Comment : Easy. Solved it in once try
// url : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

import java.util.*;
class NumMatrix {

    int[][] dp;
    public NumMatrix(int[][] matrix) {
        dp = new int[matrix.length][matrix[0].length];
        for(int i=0 ; i<matrix.length ; i++) {
            for(int j=0 ; j<matrix[0].length ; j++) {
                dp[i][j] = matrix[i][j] + (i-1<0?0:dp[i-1][j]) + (j-1<0?0:dp[i][j-1]) - (i-1<0||j-1<0?0:dp[i-1][j-1]);
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return dp[row2][col2] - (row1-1<0?0:dp[row1-1][col2]) - (col1-1<0?0:dp[row2][col1-1]) + (row1-1<0||col1-1<0?0:dp[row1-1][col1-1]);
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */