class RemoveDuplicatesFromSortedArray_TIQ {
    public int removeDuplicates(int[] nums) {
        int idx = 0;
        for(int i=0 ; i<nums.length ; i++) {
            if(nums[idx]!=nums[i]) {
                nums[++idx] = nums[i];
            }
        }
        return idx+1;
    }
}