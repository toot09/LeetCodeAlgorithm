// Difficulty : Easy
// Try once again for getting efficient result
// Runtime: 6 ms (100.00%)
class RangeSumQueryImmutable_category {

    private int[] dp;
    
    public void NumArray(int[] nums) {
        dp = new int[nums.length];
        int num = 0;
        for(int i=0 ; i<nums.length ; i++) {
            num += nums[i];
            dp[i] = num;
        }
    }
    public int sumRange(int i, int j) {
        if(i==0) return dp[j];
        return dp[j] - dp[i-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */

//Runtime: 68 ms (5.69%)
/*
class RangeSumQueryImmutable_category {

    private int[] nums;
    
    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public int sumRange(int i, int j) {
        int ret=0;
        while(i<=j) {
            ret += nums[i++];
        }
        return ret;
    }
}
*/
