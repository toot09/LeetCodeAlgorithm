// Difficulty : Medium
// Tried to code unusing DP integer array but failed
import java.util.*;
class LongestIncreasingSubsequence_category {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int ret = 1;
        for(int i = dp.length - 2; i >= 0; i--) {
            for(int j = i + 1; j < dp.length; j++) {
                if(nums[i] < nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            ret = Math.max(ret, dp[i]);
        }
        return ret;
    }
}