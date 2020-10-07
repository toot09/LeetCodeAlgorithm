class FindPeakElement_TIQ {
    public int findPeakElement(int[] nums) {
        if(nums.length == 0) return 0;
        int l = 0;
        int r = nums.length-1;
        while(r-l>1) {
            int mid = l + (r-l)/2;
            if(nums[mid]<nums[mid+1]) l = mid+1;
            else r = mid;
        }
        return nums[l]>nums[r]?l:r;
    }
}