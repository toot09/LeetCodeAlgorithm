// Difficulty : Easy
// Comment : I can solve it!
// url : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/


import java.util.*;
class BestTimeToBuyAndSellStockGoogle {
    public int maxProfit(int[] prices) {
        int sell=0, buy=Integer.MAX_VALUE, ret=0;
        for(int price : prices) {
            sell = Math.max(0, Math.max(sell, price-buy));
            buy = Math.min(buy, price);
            ret = Math.max(ret, sell);
        }
        return ret;
    }
}