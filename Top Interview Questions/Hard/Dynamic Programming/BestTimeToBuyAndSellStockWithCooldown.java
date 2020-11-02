class BestTimeToBuyAndSellStockWithCooldown_TIQ {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length < 2) return 0;
        int sell=0, preSell=0, buy=Integer.MIN_VALUE, preBuy=0;
        for(int i=0 ; i<prices.length ; i++) {
            preBuy = buy;
            buy = Math.max(preSell-prices[i], buy);
            preSell = sell;
            sell = Math.max(preBuy+prices[i], sell);
        }
        return sell;
    }
}