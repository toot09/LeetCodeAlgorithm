// Difficulty : Medium
// Comment : I can solve it!
// url : https://leetcode.com/problems/maximum-product-subarray/


import java.util.*;
class MaximumProductSubarrayGoogle {
    public int maxProduct(int[] nums) {
        int min=nums[0], max=nums[0], ret=nums[0];
        for(int i=1 ; i<nums.length ; i++) {
            int num=nums[i], tmpMax=max, tmpMin=min;
            max = Math.max(num, Math.max(tmpMax*num, tmpMin*num));
            min = Math.min(num, Math.min(tmpMax*num, tmpMin*num));
            ret = Math.max(ret, max);
        }
        return ret;
    }
}