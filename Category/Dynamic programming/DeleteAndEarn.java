// Difficulty : Medium
// Comment : I did on my own
// url : https://leetcode.com/problems/delete-and-earn/
class DeleteAndEarn_category {
    public int deleteAndEarn(int[] nums) {
        int[] dp = new int[10001];
        int idx = 0, max = 0;
        for(int num : nums) {
            dp[num] += num;
            idx = Math.max(idx,num);
        }
        for(int i=1 ; i<=idx; i++) {
            int pre = 0;
            if(i-3>=0) {
                pre = Math.max(dp[i-3],dp[i-2]);
            } else if(i-2>=0) {
                pre = dp[i-2];
            }
            dp[i] += pre;
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}