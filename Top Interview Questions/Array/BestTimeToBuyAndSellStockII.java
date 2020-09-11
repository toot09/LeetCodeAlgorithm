//Runtime: 1 ms (93.90%)
//Memory Usage: 39.2 MB (90.97%)
class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) return 0;
        int start = prices[0];
        int ret = 0;
        for(int i=1 ; i<prices.length ; i++) {
            if(prices[i] < prices[i-1]) {
                ret += prices[i-1] - start;
                start = prices[i];
            }
        }
        ret += (prices[prices.length-1] - start) > 0 ? (prices[prices.length-1] - start) : 0;
        return ret;
    }
}