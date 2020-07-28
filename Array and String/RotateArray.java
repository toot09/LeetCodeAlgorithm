class RotateArray {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        int[] tmps = new int[k];
        for(int i=0 ; i<k ; i++) {
            tmps[i] = nums[len-k+i];
        }
        for(int i=0 ; i<len-k ; i++) {
            nums[len-1-i] = nums[len-1-i-k];
        }
        for(int i=0 ; i<k ; i++) {
            nums[i] = tmps[i];
        }
    }
}