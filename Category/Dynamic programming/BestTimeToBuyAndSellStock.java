// Difficulty : Easy
// Couldn't immidiatly
class BestTimeToBuyAndSellStock_category {
    public int maxProfit(int[] prices) {
        int idx = prices.length-1;
        int profit = 0;
        for(int i=prices.length-2; i>=0 ; i--) {
            if(prices[i]>prices[idx]) idx = i;
            else profit = Math.max(profit,prices[idx]-prices[i]);
        }
        return profit;
    }
}