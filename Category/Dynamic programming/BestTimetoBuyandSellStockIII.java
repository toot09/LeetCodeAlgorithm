// Difficulty : Hard
// Comment : Hollar.... I can't clearly make idea like this...
//url : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/
class BestTimetoBuyandSellStockIII_category {
    public int maxProfit(int[] prices) {
        int sell1=0, sell2=0;
        int buy1=Integer.MAX_VALUE, buy2=Integer.MAX_VALUE;
        for(int price : prices) {
            buy1 = Math.min(buy1, price);
            sell1 = Math.max(sell1, price-buy1);
            buy2 = Math.min(buy2, price-sell1);
            sell2 = Math.max(sell2, price-buy2);
        }
        return sell2;
    }
}
