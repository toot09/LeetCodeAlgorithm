class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        int tmp = 0;
        //[1,7,3,6,5,6]
        for(int i=0 ; i<nums.length;i++) {
            tmp += nums[i];
            if(tmp == sum-tmp+nums[i]) {
                return i;
            }
        }
        return -1;
    }
}