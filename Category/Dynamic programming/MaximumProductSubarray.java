class MaximumProductSubarray_category {
    public int maxProduct(int[] nums) {
        int[][] dp = new int[2][nums.length];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            dp[0][i] = nums[i];
            dp[1][i] = nums[i];
            max = Math.max(max, nums[i]);
            if(i == 0) continue;
            for(int j = 0; j <= 1; j++) {
                int num = dp[j][i - 1] * nums[i];
                if(num >= 0) {
                    dp[0][i] = Math.max(dp[0][i], num);
                    max = Math.max(max, dp[0][i]);
                } else {
                    dp[1][i] = Math.min(dp[1][i], num);
                }
            }
        }
        return max;
    }
}