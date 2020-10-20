import java.util.*;

//Runtime: 11 ms (88.24%)
//Memory Usage: 38 MB
class CoinChange {
    public int coinChange_TIQ(int[] coins, int amount) {
        int[] amt = new int[amount+1];
        Arrays.fill(amt,amount+1);
        amt[0] = 0;
        for(int i=1 ; i<amt.length ; i++) {
            for(int j=0 ; j<coins.length ; j++) {
                if(i-coins[j]>=0) {
                    amt[i] = Math.min(amt[i-coins[j]]+1,amt[i]);
                }
            }
        }
        return amt[amount]==amount+1?-1:amt[amount];
    }
}

//Runtime: 94 ms (7.38%)
//Memory Usage: 39.8 MB
/*
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
*/