import java.util.*;
class PerfectSquares_TIQ {
    public int numSquares(int n) {
        int max = (int)Math.sqrt(n);
        int[] dp = new int[n+1];
        Arrays.fill(dp,n+1);
        for(int i=1 ; i<=n ; i++) {
            for(int j=1; j<=max ; j++) {
                int pow = (int)Math.pow(j,2);
                if(i<=pow) {
                    if(i==pow) dp[i] = 1;
                    break;
                } else {
                    dp[i] = Math.min(dp[i-pow]+1,dp[i]);
                }
            }
        }
        return dp[n];
    }
}