// Difficulty : Medium
// Comment : Need to squize my brain! Have to try again!!!!!!
// url : https://leetcode.com/problems/largest-sum-of-averages/
class LargestSumOfAverages_category {
    public double largestSumOfAverages(int[] A, int K) {
        int len = A.length;
        double[] sum = new double[len];
        for(int i=0 ; i<len ; i++) {
            sum[i] = (i==0?0:sum[i-1]) + A[i];
        }
        double[][] dp = new double[K+1][len];
        for(int g=1 ; g<=K ; g++) {
            for(int i=0 ; i<=len-g ; i++) {
                if(g==1) {
                    dp[1][i] = (double)(sum[len-1] - sum[i] + A[i])/(len-i);
                } else {
                    for(int j=i ; j<=len-g ; j++) {
                        dp[g][i] = Math.max(dp[g][i], dp[g-1][j+1] + (double)((sum[j]-sum[i]+A[i])/(j-i+1)));
                    }
                }
            }
        }
        return dp[K][0];
    }
}