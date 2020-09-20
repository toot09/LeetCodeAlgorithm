//Runtime: 0 ms (100%)
//Memory Usage: 39.8 MB (67.46%)
class MoveZeroes_TIQ {
    public void moveZeroes(int[] nums) {
        int idx = 0;
        for(int i=0 ; i<nums.length ; i++) {
            if(nums[i]!=0) {
                nums[idx] = nums[i];
                if(i!=idx++) {
                    nums[i] = 0;
                }
            }
        }
    }
}