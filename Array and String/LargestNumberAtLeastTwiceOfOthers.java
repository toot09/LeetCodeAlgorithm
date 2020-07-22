class LargestNumberAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        int idx = 0;
        int first = 0;
        int second = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>=first) {
                second = first;
                first = nums[i];
                idx = i;
            } else if (nums[i]>second) {
                second = nums[i];
            }
        }
        if(first >= second*2) {
            return idx;
        } else {
            return -1;
        }
    }
}