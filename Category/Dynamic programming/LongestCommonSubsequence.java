//1143. Longest Common Subsequence
// Difficulty : Medium
// Comment : Normally DP
// url : https://leetcode.com/problems/longest-common-subsequence/
class LongestCommonSubsequence_category {
    public int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length(), len2 = text2.length(), ret=0;
        int[][] dp = new int[len1][len2];
        for(int i1=0 ; i1<len1 ; i1++) {
            for(int i2=0 ; i2<len2 ; i2++) {
                dp[i1][i2] = Math.max((i1-1<0?0:dp[i1-1][i2]), (i2-1<0?0:dp[i1][i2-1]));
                if(text1.charAt(i1)==text2.charAt(i2)) {
                    dp[i1][i2] = Math.max(dp[i1][i2], (i1-1<0||i2-1<0?0:dp[i1-1][i2-1])+1);
                }
                ret = Math.max(ret, dp[i1][i2]);
            }
        }
        return ret;
    }
}