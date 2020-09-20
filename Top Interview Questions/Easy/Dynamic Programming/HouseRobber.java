//Runtime: 0 ms (100%)
//Memory Usage: 36.7 MB (87.18%)
class HouseRobber {
    public int rob(int[] nums) {
        int max = 0;
        for(int i=0 ; i<nums.length ; i++) {
            int pre2 = 0, pre3 = 0;
            if(i-2>=0) pre2 = nums[i-2];
            if(i-3>=0) pre3 = nums[i-3];
            nums[i] += Math.max(pre2,pre3);
            max = Math.max(max,nums[i]);
        }
        return max;
    }
}