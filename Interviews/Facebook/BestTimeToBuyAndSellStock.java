// Difficulty : Easy
// Comment : Easy. Solved it in once try
// url : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/


import java.util.*;
class BestTimeToBuyAndSellStockFacebook {
    public int maxProfit(int[] prices) {
        int profit=0, buy=Integer.MAX_VALUE;
        for(int price : prices) {
            if(price-buy>0) profit = Math.max(profit, price-buy);
            buy = Math.min(buy, price);
        }
        return profit;
    }
}