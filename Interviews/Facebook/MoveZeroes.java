// Difficulty : Easy
// Comment : Easy
// url : https://leetcode.com/problems/move-zeroes/


class MoveZeroesFacebook {
    public void moveZeroes(int[] nums) {
        int idx=0;
        for(int i=0 ; i<nums.length ; i++) {
            if(nums[i]==0) continue;
            nums[idx++] = nums[i];
        }
        while(idx<nums.length) nums[idx++] = 0;
    }
}