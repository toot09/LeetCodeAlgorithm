// Difficulty : Medium
// Comment : 2D array sort method!! (Arrays.sort(dp,(a,b)->(a[0]-b[0])))
// url : https://leetcode.com/problems/maximum-length-of-pair-chain/
import java.util.*;
class MaximumLengthOfPairChain_category {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->(a[0]-b[0]));
        int[] dp = new int[pairs.length];
        Arrays.fill(dp,1);
        int ret = 0;
        for(int i=0 ; i<dp.length ; i++) {
            for(int j=0 ; j<i ; j++) {
                if(pairs[j][1]<pairs[i][0]) dp[i] = Math.max(dp[i], dp[j]+1);
            }
            ret = Math.max(ret, dp[i]);
        }
        return ret;
    }
}