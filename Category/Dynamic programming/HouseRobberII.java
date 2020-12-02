// Difficulty : Medium
// First try!
// get 100% speed only twice tries.
class HouseRobberII_category {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] dp = new int[nums.length-1];
        int ret = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length-1 ; i++) {
            dp[i] = nums[i];
            if(i==2) {
                dp[i] += dp[i-2];
            } else if (i>2) {
                dp[i] += Math.max(dp[i-2],dp[i-3]);
            }
            ret = Math.max(ret,dp[i]);
        }

        for(int i=1 ; i<nums.length ; i++) {
            dp[i-1] = nums[i];
            if(i==3) {
                dp[i-1] += dp[i-3];
            } else if(i>3) {
                dp[i-1] += Math.max(dp[i-3],dp[i-4]);
            }
            ret = Math.max(ret, dp[i-1]);
        }
        return ret;
    }
}