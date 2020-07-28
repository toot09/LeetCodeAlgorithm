class MaxConsecutiveOnes_2 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ret = 0;
        int tmp = 0;
        for(int num : nums) {
            if(num == 1) {
                ret = Math.max(ret,++tmp);
            } else {
                tmp = 0;
            }
        }
        return ret;
    }
}