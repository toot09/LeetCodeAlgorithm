// Difficulty : Medium
// Comment : Great Problem!
// url : https://leetcode.com/explore/interview/card/facebook/53/recursion-3/278/


import java.util.*;
class SubsetsFacebook {
    List<List<Integer>> ret = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        helper(nums, new ArrayList<Integer>(), 0);
        return ret;
    }
    public void helper(int[] nums, List<Integer> list, int idx) {
        ret.add(new ArrayList<>(list));
        if(idx==nums.length) return;
        for(int i=idx ; i<nums.length ; i++) {
            list.add(nums[i]);
            helper(nums, list, i+1);
            list.remove(list.remove(list.size()-1));
        }
    }
}