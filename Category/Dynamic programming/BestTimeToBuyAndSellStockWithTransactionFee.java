//714. Best Time to Buy and Sell Stock with Transaction Fee
// Difficulty : Medium
// Comment : I did it!!! I remembered a similar problem!!!
// url : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
class BestTimeToBuyAndSellStockWithTransactionFee_category {
    public int maxProfit(int[] prices, int fee) {
        if(prices.length==0) return 0;
        int buy = prices[0]*-1, sell=0;
        int preBuy = prices[0]*-1, preSell=0;
        for(int i=1 ; i<prices.length ; i++) {
            sell = Math.max(preSell, preBuy+prices[i]-fee);
            buy = Math.max(preBuy, preSell-prices[i]);
            preSell = sell;
            preBuy = buy;
        }
        return sell;
    }
}