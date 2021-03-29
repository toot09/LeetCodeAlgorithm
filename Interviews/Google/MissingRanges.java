// 163. Missing Ranges
// Difficulty : Easy
// Comment : Solved once try!
// url : https://leetcode.com/problems/missing-ranges/

import java.util.*;
class MissingRanges {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        int s = lower;
        List<String> ret = new ArrayList<>();
        for(int num : nums) {
            helper(ret, num, s);
            s = num+1;
        }
        helper(ret, upper+1, s);
        return ret;
        
    }
    public void helper(List<String> ret, int num, int s) {
        StringBuilder sb = new StringBuilder();
        if(s<num) {
            sb.append(s);
            if(s<num-1) sb.append("->").append(num-1);
        }
        if(sb.length()>0) ret.add(sb.toString());
    }
}