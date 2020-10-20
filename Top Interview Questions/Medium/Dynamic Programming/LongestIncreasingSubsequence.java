import java.util.*;
//Runtime: 11 ms (58.47%)
//Memory Usage: 36.8 MB
//This is not best way. (Hint. Use BinaryTree)
class LongestIncreasingSubsequence_TIQ {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0) return 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int ret = 1;
        for(int i=1; i<nums.length ; i++) {
            for(int j=0 ; j<i ; j++) {
                if(nums[i]>nums[j]) dp[i] = Math.max(dp[i],dp[j]+1);
            }
            ret = Math.max(dp[i],ret);
        }
        return ret;
    }
}