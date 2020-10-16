//Runtime: 1 ms (94.17%)
//Memory Usage: 40.7 MB
class JumpGame {
    public boolean canJump(int[] nums) {
        int i=0;
        for(int reach=0; i<nums.length && i<=reach ; i++) {
            reach = Math.max(i+nums[i],reach);
        }
        return i==nums.length;
    }
}

//Runtime: 279 ms (27.85%)
//Memory Usage: 40.8 MB
/*
class JumpGame {
    public boolean canJump(int[] nums) {
        if(nums.length==0) return false;
        if(nums.length==1) return true;
        int[] steps = new int[nums.length];
        for(int i=0 ; i<nums.length-1 ; i++) {
            int num = nums[i];
            if(i==0 || steps[i]==1) {
                for(int j=1 ; j<=num ; j++) {
                    if(i+j<nums.length) {
                        if(i+j==nums.length-1) return true;
                        else steps[i+j] = 1;
                    }
                }
            }
        }
        return false;
    }
}
*/