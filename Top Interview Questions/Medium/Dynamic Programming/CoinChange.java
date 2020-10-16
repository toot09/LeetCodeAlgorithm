import java.util.*;
//Runtime: 94 ms (7.38%)
//Memory Usage: 39.8 MB
class CoinChange {
    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> hs = new HashSet<>();
        int ret = 1;
        for(int c : coins) {
            if(c==amount) return ret;
            q.offer(c);
            hs.add(c);
        }
        while(q.size()>0) {
            int size = q.size();
            ret++;
            for(int i=1 ; i<=size ; i++) {
                int coin = q.poll();
                for(int c : coins) {
                    int sum = coin + c;
                    if(sum==amount) return ret;
                    else if(sum<amount && !hs.contains(sum)) {
                        q.offer(sum);
                        hs.add(sum);
                    }
                }
            }
        }
        return -1;
    }
}