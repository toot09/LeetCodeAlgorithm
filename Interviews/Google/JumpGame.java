// 55. Jump Game
// Difficulty : Medium
// Comment : Great Prob.!!!
// url : https://leetcode.com/problems/jump-game/

import java.util.*;
class JumpGameGoogle {
    public boolean canJump(int[] nums) {
        int reach=0;
        for(int i=0 ; i<nums.length && reach>=i && reach<nums.length-1 ; i++) {
            reach = Math.max(reach, nums[i]+i);
        }
        return reach>=nums.length-1;
    }
}