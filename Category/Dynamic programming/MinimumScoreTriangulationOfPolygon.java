//1039. Minimum Score Triangulation of Polygon
// Difficulty : Medium
// Comment : Can see as much as I know
// url : https://leetcode.com/problems/minimum-score-triangulation-of-polygon/
import java.util.*;
class MinimumScoreTriangulationOfPolygon_category {
    public int minScoreTriangulation(int[] A) {
        int len = A.length;
        int[][] dp = new int[len][len];
        for(int d=2 ; d<len ; d++) {
            for(int i=0 ; i+d<len ; i++) {
                int j = i+d;
                dp[i][j] = Integer.MAX_VALUE;
                for(int k=i+1 ; k<j ; k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k]+dp[k][j]+A[i]*A[j]*A[k]);
                }
            }
        }
        return dp[0][len-1];
    }
}