// Difficulty : Medium
// Comment : Holy... It was one of the most difficult problem.
//			 I can know about MinMax algorithm!!
// url : https://leetcode.com/problems/predict-the-winner/
class PredictTheWinner_category {
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
		int[][] dp = new int[n][n];
		for(int i=0 ; i<n ; i++) {
			dp[i][i] = nums[i];
		}
		for(int len=1; len<n ; len++) {
			for(int i=0 ; i+len < n ; i++) {
				int j = i+len;
				dp[i][j] = Math.max(nums[i]-dp[i+1][j], nums[j]-dp[i][j-1]);
			}
		}
		return dp[0][n-1]>=0;
    }
}