class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int ret = 1;
        for(int i = 1 ; i<nums.length ; i++) {
            if(nums[i] != nums[ret-1]) {
                nums[ret++] = nums[i];
            }
        }
        return ret;
    }
    
}