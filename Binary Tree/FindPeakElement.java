
// Difficulty : Medium
// Comment : Not bad but Thumbs Up ratio is not good (50%).
// url : https://leetcode.com/explore/learn/card/binary-search/135/template-iii/946/

class FindPeakElement_loop {
    public int findPeakElement(int[] nums) {
        int s=0, e=nums.length-1;
        while(s<e) {
            int mid = s+(e-s)/2;
            if(nums[mid+1]<nums[mid]) {
                e = mid;
            } else {
                s = mid+1;
            }
        }
        return s;
    }
}
/*
class FindPeakElement_recursive {
    public int findPeakElement(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }
    public int helper(int[] nums, int s, int e) {
        if(s>e) return 0;
        int mid = s+(e-s)/2;
        if( (mid<=0?Integer.MIN_VALUE:nums[mid-1]) < nums[mid] && (mid>=nums.length-1?Integer.MIN_VALUE:nums[mid+1]) < nums[mid]) return mid;
        return Math.max(helper(nums,s,mid-1), helper(nums,mid+1,e));
    }
}
*/