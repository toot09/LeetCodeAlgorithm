class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        int sum = 0;
        int start = 0;
        int ret = 0;
        for(int i=0 ; i<nums.length ; i++) {
            sum += nums[i];
            while(sum>=s) {
                if(ret == 0) {
                    ret = i-start+1;
                } else {
                    ret = Math.min(ret,i-start+1);
                }
                sum -= nums[start++];
            }
        }
        return ret;
    }
}