// Find Minimum in Rotated Sorted Array II
// Difficulty : Hard
// Comment : Hard?!!!!!!!!!
// url : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
class FindMinimumInRotatedSortedArrayII {
    public int findMin(int[] nums) {
        int s=0, e=nums.length-1;
        //[3,3,1,3]
        while(s<e) {
            int mid = s+(e-s)/2;
            if(nums[e]==nums[mid]) {
                if(nums[s]<nums[e]) e = mid;
                else s += 1;
            } else if(nums[e]<nums[mid]) {
                s = mid+1;
            } else {
                e = mid;
            }
        }
        return nums[s];
    }
}