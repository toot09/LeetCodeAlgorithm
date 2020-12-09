// Difficulty : Medium
// Comment : Fail to Ideation but after getting hint, pass first try.
// Runtime : 7ms(87%)
// url : https://leetcode.com/problems/partition-equal-subset-sum/
class PartitionEqualSubsetSum_category {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int n : nums) sum+=n;
        if(sum%2==1) return false;
        sum /= 2;
        boolean[] dp = new boolean[sum+1];
        for(int n : nums) {
            for(int i = sum-n ; i>=0 ; i--) {
                if(dp[i]) dp[i+n] = true;
            }
            dp[n>sum?0:n] = true;
            if(dp[sum]) return true;
        }
        return false;
    }
}