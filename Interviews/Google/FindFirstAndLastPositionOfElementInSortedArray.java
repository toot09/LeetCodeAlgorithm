// Difficulty : Medium
// Comment : I Try it 4 times... So I have to try again!!
// url : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
class FindFirstAndLastPositionOfElementInSortedArrayGoogle {
    public int[] searchRange(int[] nums, int target) {
        int l = getIdx(nums, target, true);
        if(l==-1) return new int[]{-1,-1};
        int r = getIdx(nums, target, false);
        return new int[]{l,r};
    }
    public int getIdx(int[] nums, int target, boolean ynLeft) {
        int s=0, e=nums.length-1;
        while(s<=e) {
            int mid = s+(e-s)/2;
            if(nums[mid]<target) {
                s = mid+1;
            } else if(nums[mid]>target) {
                e = mid-1;
            } else {
                if(ynLeft) {
                    if(mid==0 || nums[mid-1]!=target) return mid;
                    e = mid-1;
                } else {
                    if(mid==nums.length-1 || nums[mid+1]!=target) return mid;
                    s = mid+1;
                }
            }
        }
        return -1;
    }
}