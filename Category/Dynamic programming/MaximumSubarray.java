// Difficulty : Easy
class MaximumSubarray_category {
    public int maxSubArray(int[] nums) {
        if(nums.length==0 || nums==null) return 0;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int ret = dp[0];
        for(int i=1; i<nums.length ; i++) {
            int sum = dp[i-1] + nums[i];
            if(sum > nums[i]) dp[i] = sum;
            else dp[i] = nums[i];
            ret = Math.max(ret,dp[i]);
        }
        return ret;
    }
}