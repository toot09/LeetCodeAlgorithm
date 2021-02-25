// 33. Search in Rotated Sorted Array
// Difficulty : Medium
// Comment : Squeeze brain! I can solve it after study a day.
// url : https://leetcode.com/problems/search-in-rotated-sorted-array/
class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int s=0, e=nums.length-1;
        while(s<e) {
            int mid = s + (e-s)/2;
            if(nums[e]<nums[mid]) {
                s = mid+1;
            } else {
                e = mid;
            }
        }
        int start = e;
        e = nums.length-1;
        s = 0;
        if(nums[start]<=target && target<=nums[e]) s = start;
        else e = start;
        //System.out.println("s : "+s+"\te : "+e);
        while(s<=e) {
            int mid=s+(e-s)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]<target) s = mid+1;
            else e = mid-1;
        }
        return -1;
    }
}