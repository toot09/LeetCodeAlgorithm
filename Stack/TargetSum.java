//Runtime: 516 ms
//Memory Usage: 37.5 MB
class TargetSum {
    public int findTargetSumWays(int[] nums, int S) {
        return DFS(nums, 0, 0, S);
    }
    
    public int DFS(int[] nums, int cnt, int sum, int S) {
        if(cnt==nums.length) {
            if(sum==S) {
                return 1;
            } else {
                return 0;
            }
        }
        return DFS(nums, cnt+1, sum+nums[cnt], S) + DFS(nums, cnt+1, sum-nums[cnt], S);
    }
}