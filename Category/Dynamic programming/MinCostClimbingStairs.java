//746. Min Cost Climbing Stairs
//Difficulty : Easy
//Comment : Easy
// url : https://leetcode.com/problems/min-cost-climbing-stairs/
class MinCostClimbingStairs_category {
    public int minCostClimbingStairs(int[] cost) {
        int f0 = cost[0], f1 = cost[1];
        for(int i=2 ; i<cost.length ; i++) {
            int tmp = cost[i] + Math.min(f1,f0);
            f0 = f1;
            f1 = tmp;
        }
        return Math.min(f1,f0);
    }
}