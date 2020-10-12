//Runtime: 0 ms (100%)
//Memory Usage: 42.1 MB
class FindFirstAndLastPositionOfElementInSortedArray_TIQ {
    public int[] searchRange(int[] nums, int target) {
        int[] ret = new int[]{-1,-1};
        if(nums.length==0) return ret;
        int l = 0;
        int r = nums.length-1;
        while(r-l>1) {
            int mid = l + (r-l)/2;
            if(nums[mid] < target) {
                l = mid;
            } else {
                r = mid;
            }
        }
        if(nums[l]==target) r = l;
        if(nums[r]!=target) return ret;
        else {
            ret[0] = r;
            ret[1] = r;
        }
        while(++r<nums.length && nums[r]==target) {
            ret[1] = r;
        }
        return ret;
    }
}