// 121. Best Time to Buy and Sell Stock
/*
원래는 O(n2) 으로 풀었다.(이중 for문)
근데 시점이므로 buy 값은 무조건 시간이 지날수록 가장 작은 값이므로
Math.min 을 해주면 간단하게 O(N)으로 해결할 수 있다.
*/
class BestTimeToBuyandSellStock {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        for(int i=0;i<prices.length;i++) {
            buy = Math.min(buy,prices[i]);
            profit = Math.max(profit,prices[i]-buy);
        }
        return profit;
    }
}