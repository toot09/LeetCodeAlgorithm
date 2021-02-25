//34. Find First and Last Position of Element in Sorted Array
// Difficulty : Medium
// Comment : I solved '2020 but I couln't solve 2021. So I have to try it once again
// url : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0) return new int[]{-1,-1};
        int s = helper(nums, target, 0);
        if(nums[s]!=target) return new int[]{-1,-1};
        int e = helper(nums, target+1, s);
        if(nums[e]!=target) e-=1;
        return new int[]{s,e};
    }
    public int helper(int[] nums, int target, int s) {
        int e = nums.length-1;
        //5,7,7,8,10,11,12
        while(s<e) {
            int mid = s+(e-s)/2;
            if(target<=nums[mid]) {
                e = mid;
            } else {
                s = mid+1;
            }
        }
        return s;
    }
}