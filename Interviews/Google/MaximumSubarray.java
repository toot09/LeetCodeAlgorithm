// Difficulty : Easy
// Comment : Easy
// url : https://leetcode.com/explore/interview/card/google/64/dynamic-programming-4/3086/


class MaximumSubarrayGoogle {
    public int maxSubArray(int[] nums) {
        int sum=Integer.MIN_VALUE, ret=Integer.MIN_VALUE;
        for(int num : nums) {
            if(sum<0) sum = num;
            else sum += num;
            ret = Math.max(sum, ret);
        }
        return ret;
    }
}