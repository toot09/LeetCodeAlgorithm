// Difficulty : Medium
class HouseRobber_category {
    public int rob(int[] nums) {
        if(nums.length==0 || nums==null) return 0;
        if(nums.length==1) return nums[0];
        int len = nums.length;
        int[] dp = new int[len];
        for(int i=0 ; i<len ; i++) {
            dp[i] = nums[i];
            if(i<=2) {
                if(i==2) dp[i] += dp[i-2];
                continue;
            }
            dp[i] += Math.max(dp[i-2],dp[i-3]);
        }
        return dp[len-1]>dp[len-2]?dp[len-1]:dp[len-2];
    }
}