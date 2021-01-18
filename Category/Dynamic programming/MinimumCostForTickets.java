//983. Minimum Cost For Tickets
// Difficulty : Medium
// Comment : Easier than I thought
// url : https://leetcode.com/problems/minimum-cost-for-tickets/submissions/
class MinimumCostForTickets_category {
    public int mincostTickets(int[] days, int[] costs) {
        int len = days.length;
        int[] dp = new int[366];
        int idx = 0;
        for(int i=days[0] ; i<=days[len-1] ; i++){
            if(i==days[idx]) {
                dp[i] = dp[i-1]+costs[0];
                dp[i] = Math.min(dp[i], ((i-7)<0?0:dp[i-7])+costs[1]);
                dp[i] = Math.min(dp[i], ((i-30)<0?0:dp[i-30])+costs[2]);
                idx++;
            } else {
                dp[i] = dp[i-1];
            }
        }
        return dp[days[len-1]];
    }
}