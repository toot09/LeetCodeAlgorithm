//Runtime: 0 ms
//Memory Usage: 38.4 MB
//Max!
class RemoveElement_2 {
    public int removeElement(int[] nums, int val) {
        int idx = 0;
        for(int i=0 ; i<nums.length ; i++) {
            if(nums[i]!=val) {
                nums[idx] = nums[i];
                idx++;
            }
        }
        return idx;
    }
}