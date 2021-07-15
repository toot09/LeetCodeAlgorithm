// Difficulty : Medium
// Comment : Great and Basic Prob.
// url : https://leetcode.com/problems/generate-parentheses/


class GenerateParenthesesFacebook {
    public int[] productExceptSelf(int[] nums) {
        int[] ret = new int[nums.length];
        ret[0] = nums[0];
        for(int i=1 ; i<nums.length ; i++) {
            ret[i] = ret[i-1]*nums[i];
        }
        int mul = 1;
        for(int i=nums.length-1 ; i>=0 ; i--) {
            mul *= (i==nums.length-1?1:nums[i+1]);
            ret[i] = mul * (i==0?1:ret[i-1]);
        }
        return ret;
    }
}