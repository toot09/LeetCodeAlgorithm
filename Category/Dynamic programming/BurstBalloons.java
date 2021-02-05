// 312. Burst Balloons
// Difficulty : Hard
// Comment : Oh my god.... I'm stupit... :(
// url : https://leetcode.com/problems/burst-balloons/
class BurstBalloons_category {
    public int maxCoins(int[] nums) {
        int len = nums.length;
        int[][] dp = new int[len][len];
        for(int j=0 ; j<len ; j++) {
            for(int i=j ; i>=0 ; i--) {
                for(int k=i ; k<=j ; k++) {
                    dp[i][j] = Math.max(dp[i][j], (k-1<i?0:dp[i][k-1]) + (i-1<0?1:nums[i-1])*nums[k]*(j+1>=len?1:nums[j+1]) + (k+1>j?0:dp[k+1][j]));
                }
            }
        }
        return dp[0][len-1];
    }
}