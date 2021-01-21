//1043. Partition Array for Maximum Sum
// Difficulty : Medium
// Comment : Almost close to efficient code.
// url : https://leetcode.com/problems/partition-array-for-maximum-sum/
class PartitionArrayForMaximumSum_category {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int len = arr.length;
        int[] dp = new int[len];
        for(int i=0 ; i<len ; i++) {
            int max = 0;
            for(int j=1 ; j<=k && i-j+1>=0 ; j++) {
                max = Math.max(max, arr[i-j+1]);
                dp[i] = Math.max(dp[i], (i-j<0?0:dp[i-j])+(max*j));
            }
        }
        return dp[len-1];
    }
}

// Inefficient code (Using 2D and three loop)
/*
class PartitionArrayForMaximumSum_category {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int len = arr.length;
        int[][] dp = new int[len][len];
        for(int j=0 ; j<len ; j++) {
            dp[j][j] = arr[j];
            for(int i=j-1 ; i>=0 ; i--) {
                dp[i][j] = Integer.MIN_VALUE;
                if(j-i+1<=k) {
                    for(int idx=i ; idx<=j ; idx++) {
                        dp[i][j] = Math.max(dp[i][j], arr[idx]*(j-i+1));
                    }
                } else {
                    for(int idx=i ; idx<j ; idx++) {
                        dp[i][j] = Math.max(dp[i][j], dp[i][idx]+dp[idx+1][j]);
                    }
                }
            }
        }
        return dp[0][len-1];
    }
}
*/