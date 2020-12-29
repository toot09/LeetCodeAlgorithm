// Difficulty : Medium
// Comment : So Difficult and It is great DP Problem. I have to remind this one!
// url : https://leetcode.com/problems/ones-and-zeroes/
class OnesAndZeroes_category {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        int ret = 0;
        for(String str : strs) {
            int[] cnt = count(str);
            for(int i=m ; i>=cnt[0] ; i--) {
                for(int j=n ; j>=cnt[1] ; j--) {
                    dp[i][j] = Math.max(dp[i-cnt[0]][j-cnt[1]]+1, dp[i][j]);
                    ret = Math.max(ret, dp[i][j]);
                }
            }
        }
        return ret;
    }
    public int[] count(String str) {
        int[] cnt = new int[2];
        for(int i=0 ; i<str.length() ; i++) {
            cnt[str.charAt(i)-'0']++;
        }
        return cnt;
    }
}