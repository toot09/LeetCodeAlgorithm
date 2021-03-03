// 287. Find the Duplicate Number
// Difficulty : Medium
// Comment : Easy
// url : https://leetcode.com/problems/find-the-duplicate-number/

class FindTheDuplicateNumber {
public int FindTheDuplicateNumber(int[] nums) {
        int len = nums.length-1;
        int[] arr = new int[len];
        for(int num : nums) {
            if(arr[num-1]++>0) return num;
        }
        return -1;
    }
}
/*
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

*/