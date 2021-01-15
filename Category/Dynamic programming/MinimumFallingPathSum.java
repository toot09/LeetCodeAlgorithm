//931. Minimum Falling Path Sum
// Difficulty : Medium
// Comment : If use DP, so Easy!
// url : https://leetcode.com/problems/minimum-falling-path-sum/submissions/
import java.util.*;
class MinimumFallingPathSum_categoty {
    public int minFallingPathSum(int[][] A) {
        int len = A.length;
        int ret = Integer.MAX_VALUE;
        for(int i=0 ; i<len ; i++) {
            for(int j=0 ; j<len ; j++) {
                if(i!=0) {
                    int side = Math.min(j==0?Integer.MAX_VALUE:A[i-1][j-1], j==len-1?Integer.MAX_VALUE:A[i-1][j+1]);
                    A[i][j] += Math.min(side, A[i-1][j]);
                }
                if(i==len-1) {
                    ret = Math.min(ret, A[i][j]);
                }
            }
        }
        return ret;
    }
}