class MoveZeroes_2 {
    public void moveZeroes(int[] nums) {
        int idx = 0;
        for(int i=0 ; i < nums.length ; i++) {
            if(nums[i]!=0) {
                nums[idx] = nums[i];
                if(i != idx++) {
                    nums[i] = 0;
                }
            }
        }
    }
}
