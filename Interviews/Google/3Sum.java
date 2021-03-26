// 15. 3Sum
// Difficulty : Medium
// Comment : Squeeze Brain!! Great Prob.
// url : https://leetcode.com/problems/3sum/
import java.util.*;
class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0 ; i<nums.length-2 ; i++) {
            if(i>0 && nums[i-1]==nums[i]) continue;
            int s=i+1, e=nums.length-1, num=nums[i];
            while(s<e) {
                if(nums[s]+nums[e]<0-num) {
                    s++;
                } else if(nums[s]+nums[e]>0-num) {
                    e--;
                } else {
                    ret.add(Arrays.asList(new Integer[]{num,nums[s],nums[e]}));
                    while(s<e && nums[s]==nums[s+1]) s++;
                    while(s<e && nums[e]==nums[e-1]) e--;
                    s++;
                    e--;
                }
            }
        }
        return ret;
    }
}