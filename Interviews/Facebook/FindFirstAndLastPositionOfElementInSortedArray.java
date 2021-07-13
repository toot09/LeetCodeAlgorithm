// Difficulty : Medium
// Comment : Easy~ Easy~
// url : https://leetcode.com/explore/interview/card/facebook/54/sorting-and-searching-3/3030/#


import java.util.*;
class FindFirstAndLastPositionOfElementInSortedArrayFacebook {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[]{-1,-1};
        int left = helper(nums, target, 0, nums.length-1, true);
        if(nums[left]!=target) return new int[]{-1,-1};
        int right = helper(nums, target, 0,  nums.length-1, false);
        return new int[]{left, right};
        
    }
    public int helper(int[] nums, int target, int s, int e, boolean left) {
        while(s<e) {
            int mid = s+(e-s)/2;
            if(nums[mid]<target) {
               s = mid+1;
            } else if(target<nums[mid]) {
                e = mid-1;
            } else {
                if(left) {
                    if(mid>0 && nums[mid-1]!=target) return mid;
                    e = mid-1;
                } else {
                    if(mid<nums.length-1 && nums[mid+1]!=target) return mid;
                    s = mid+1;
                } 
            }
        }
        return s;
    }
}