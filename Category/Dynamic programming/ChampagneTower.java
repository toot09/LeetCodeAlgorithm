//799. Champagne Tower
// Difficulty : Medium
// Comment : Don't need to using 2D Array. Thinking!!!
// url : https://leetcode.com/problems/champagne-tower/submissions/
class ChampagneTower_category {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[] dp = new double[query_row+1];
        dp[0] = poured;
        for(int i=1 ; i<=query_row ; i++) {
            for(int j=i-1 ; j>=0 ; j--) {
                dp[j] = Math.max(0,(dp[j]-1)/2);
                dp[j+1] += dp[j];
            }
        }
        return Math.min(dp[query_glass],1);
    }
}


//Time Limit Exceeded
/*
class ChampagneTower {
    public double champagneTower(int poured, int query_row, int query_glass) {
        if(poured==0) return 0.0;
        double[][] dp = new double[query_row+1][query_row+1];
        int start = 1;
        dp[0][0] = 1;
        poured--;
        while((poured--)>0) {
            for(int i=start ; i<=query_row ; i++) {
                int sum = 0;
                for(int j=start ; j<=i ; j++) {
                    if(i==start) dp[i][j] += (1/(i+1.0)) * (j==0 || j==i ? 1:2);
                    if(dp[i][j]>1 && (i+1)<=query_row) {
                        double num = dp[i][j]-1;
                        dp[i+1][j] += (num/2);
                        dp[i+1][j+1] += (num/2);
                        dp[i][j] = 1;
                    }
                    sum += dp[i][j];
                }
                if(sum==0) {
                    break;
                } else if(sum==i+1) {
                    start = i+1;
                }
            }
        }
        return dp[query_row][query_glass];
    }
}
*/