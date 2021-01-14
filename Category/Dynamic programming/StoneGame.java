// 877. Stone Game
// Difficulty : Medium
// Comment : I remember similar problems
// url : https://leetcode.com/problems/stone-game/
class StoneGame_category {
    public boolean stoneGame(int[] piles) {
        int len = piles.length;
        int[][] dp = new int[len][len];
        for(int j=0 ; j<len ; j++) {
            dp[j][j] = piles[j];
            for(int i=j-1 ; i>=0 ; i--) {
                dp[i][j] = Math.max(piles[i]-dp[i+1][j], piles[j]-dp[i][j-1]);
            }
        }
        return 0<dp[0][len-1];
    }
}