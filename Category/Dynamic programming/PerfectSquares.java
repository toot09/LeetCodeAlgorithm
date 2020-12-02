// Difficulty : Medium
// Better than pre-code!
// 81ms(11/02) , 32ms(12/01)
class PerfectSquares_category {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        for(int i=1 ; i<=n ; i++) {
            dp[i] = i;
            for(int j=1 ; j*j<=i ; j++) {
                int idx = j*j;
                if(idx==i) {
                    dp[i] = 1;
                    break;
                }
                dp[i] = Math.min(dp[i],dp[i-idx]+1);
            }
        }
        return dp[dp.length-1];
    }
}