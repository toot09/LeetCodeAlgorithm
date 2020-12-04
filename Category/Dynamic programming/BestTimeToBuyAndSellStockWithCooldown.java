// Difficulty : Medium
// comment : It was second Try but I Couldn't code right away.
// so, I have to solve this Question become Expert..!
// My code
class BestTimeToBuyAndSellStockWithCooldown_category {
    public int maxProfit(int[] prices) {
        if(prices.length<=1) return 0;
        int[][] dp = new int[2][prices.length];
        for(int i=0 ; i<prices.length ; i++) {
            if(i==0) {
                dp[0][i] = -1 * prices[i];
                continue;
            }
            //buy
            dp[0][i] = Math.max(dp[0][i-1], (i<2?0:dp[1][i-2]) - prices[i]);
            //sell
            dp[1][i] = Math.max(dp[1][i-1], dp[0][i-1] + prices[i]);
        }
        return dp[1][prices.length-1];
    }
}