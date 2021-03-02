// 287. Find the Duplicate Number
// Difficulty : Medium
// Comment : Easy
// url : https://leetcode.com/problems/find-the-duplicate-number/

import java.util.*;
class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int idx = 0;
        Arrays.sort(nums);
        for(int i=1; i<nums.length ; i++) {
            if(nums[idx]==nums[i]) break;
            idx=i;
        }
        return nums[idx];
    }
}