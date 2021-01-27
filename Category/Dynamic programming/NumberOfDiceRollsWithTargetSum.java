//1155. Number of Dice Rolls With Target Sum
// Difficulty : Medium
// Comment : kick(dp[0][0] = 1 / p[i][j] = (dp[i][j] + dp[i-1][j-k])
// url : https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/ 
class NumberOfDiceRollsWithTargetSum_category {
    public int numRollsToTarget(int d, int f, int target) {
        int MOD = 1000000007;
        int[][] dp = new int[d+1][target+1];
        dp[0][0] = 1;
        for(int i=1 ; i<=d ; i++) {
            for(int j=1 ; j<=target ; j++) {
                for(int k=1 ; k<=f ; k++) {
                    if(j-k>=0) {
                        dp[i][j] = (dp[i][j] + dp[i-1][j-k] ) % MOD;
                    }
                }
            }
        }
        return dp[d][target];
    }
}