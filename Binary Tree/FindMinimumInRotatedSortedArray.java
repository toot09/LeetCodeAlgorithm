// 153. Find Minimum in Rotated Sorted Array
// Difficulty : Medium
// Comment : Medium!? It is a concise and good Prob.
// url : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int s=0, e=nums.length-1;
        while(s<e) {
            int mid = s+(e-s)/2;
            if(nums[e]<nums[mid]) {
                s = mid+1;
            } else {
                e = mid;
            }
        }
        return nums[s];
    }
}