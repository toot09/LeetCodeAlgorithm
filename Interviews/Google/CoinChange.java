// Difficulty : Medium
// Comment : Remember what watched youtube how to solve it because It was very impressive
// url : https://leetcode.com/problems/coin-change/

import java.util.*;
class  CoinChangeGoogle {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        for(int i=1 ; i<=amount ; i++) {
            dp[i] = amount+1;
            for(int coin : coins) {
                if(i-coin<0) continue;
                dp[i] = Math.min(dp[i],dp[i-coin]+1);
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
}