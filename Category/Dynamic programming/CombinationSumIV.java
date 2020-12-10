// Difficulty : Medium
// Comment : Just once!
// Runtime 1ms(85%)
class CombinationSumIV_category {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        for(int i=1 ; i<=target ; i++) {
            for(int j=0 ; j<nums.length ; j++) {
                if(nums[j]>i) continue;
                else if(nums[j]==i) dp[i]++;
                else dp[i] += dp[i-nums[j]];
            }
        }
        return dp[target];
    }
}