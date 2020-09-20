//Runtime: 1 ms (99.23%)
//Memory Usage: 39.8 MB (32.58)
//My Code
class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int ret = 0;
        for(int i=0; i<prices.length ; i++) {
            int p = prices[i];
            max = Math.max(max,prices[i]);
            if(min > prices[i]) {
                min = prices[i];
                max = 0;
            }
            ret = Math.max(max-min,ret);
        }
        return ret;
    }
}

//Runtime: 1 ms (99.23%)
//Memory Usage: 39.7 MB (37.09%)
/*
class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int ret = 0;
        for(int i=0 ; i<prices.length ; i++) {
            int p = prices[i];
            if(p < min) {
                min = p;
            } else {
                ret = Math.max(p-min,ret);
            }
        }
        return ret;
    }
}
*/