//115. Distinct Subsequences
// Difficulty : Hard
// Comment : Almost close to correction
// url : https://leetcode.com/problems/distinct-subsequences/
class DistinctSubsequences_category {
    public int numDistinct(String s, String t) {
        int lenS = s.length(), lenT = t.length();
        int[][] dp = new int[lenT+1][lenS+1];
        for(int i=0 ; i<=lenS ; i++) dp[0][i] = 1;
        for(int i=0 ; i<lenT ; i++) {
            for(int j=0 ; j<lenS ; j++) {
                if(t.charAt(i)==s.charAt(j)) {
                    dp[i+1][j+1] = dp[i+1][j] + dp[i][j];
                } else {
                    dp[i+1][j+1] = dp[i+1][j];
                }
            }
        }
        return dp[lenT][lenS];
    }
}