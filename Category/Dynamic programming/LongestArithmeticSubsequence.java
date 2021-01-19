//1027. Longest Arithmetic Subsequence
// Difficulty : Medium
// Comment : Remember Type like this!! dp[last idx][diff]
// url : https://leetcode.com/problems/longest-arithmetic-subsequence/
import java.util.*;
class LongestArithmeticSubsequence_category {
    public int longestArithSeqLength(int[] A) {
        int[][] dp = new int[A.length][1001];
        int max = 0;
        for(int i=0 ; i<A.length ; i++) {
            for(int j=0 ; j<i ; j++) {
                int diff = A[i]-A[j]+500;
                dp[i][diff] = Math.max(dp[i][diff],dp[j][diff]+1);
                max = Math.max(max, dp[i][diff]);
            }
        }
        return max==0?0:max+1;
    }
}

// Inefficient code
/*
class LongestArithmeticSubsequence_category {
    public int longestArithSeqLength(int[] A) {
        Map<Integer, Integer>[] dp = new HashMap[A.length];
        int ret = 0;
        for(int i=0 ; i<A.length ; i++) {
            dp[i] = new HashMap<Integer, Integer>();
            for(int j=0 ; j<i ; j++) {
                int diff = A[i]-A[j];
                dp[i].put(diff, Math.max(dp[i].getOrDefault(diff,0), dp[j].getOrDefault(diff,1)+1));
                ret = Math.max(ret, dp[i].get(diff));
            }
        }
        return ret;
    }
}
*/