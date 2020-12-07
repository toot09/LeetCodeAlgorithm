//Difficulty : Medium
//Runtime: 0 ms
//Memory Usage: 37.6 MB
class IntegerBreak_category {
    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        for(int i=2 ; i<=n ; i++) {
            if(i>=2 && i<=6) {
                if(i==2) dp[2] = 1;
                if(i==3) dp[3] = 2;
                if(i==4) dp[4] = 4;
                if(i==5) dp[5] = 6;
                if(i==6) dp[6] = 9;
                continue;
            }
            dp[i] = dp[i-3] * 3;
        }
        return dp[n];
    }
}