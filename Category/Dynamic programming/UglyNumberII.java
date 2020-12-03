class UglyNumberII_category {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        int idx2=0, idx3=0, idx5=0;
        int num2=2, num3=3, num5=5;
        dp[0] = 1;
        for(int i=1 ; i<n ; i++) {
            int min = Math.min(Math.min(dp[idx2]*2,dp[idx3]*3),dp[idx5]*5);
            dp[i] = min;
            if(min==num2) num2 = dp[++idx2] * 2;
            if(min==num3) num3 = dp[++idx3] * 3;
            if(min==num5) num5 = dp[++idx5] * 5;
        }
        return dp[n-1];
    }
}