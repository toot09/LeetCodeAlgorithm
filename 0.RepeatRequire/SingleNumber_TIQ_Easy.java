//Runtime: 0 ms (100%)
//Memory Usage: 40.8 MB (32.22%)
class SingleNumber_TIQ_Easy {
    public int singleNumber(int[] nums) {
        int ret = 0;
        for(int i=0 ; i<nums.length ; i++) {
            //find Single number to using "XOR"!!
            ret ^= nums[i];
        }
        return ret;
    }
}
