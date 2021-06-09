// Difficulty : Medium
// Comment : It is easier than before i solved
// url : https://leetcode.com/problems/permutations/


import java.util.*;
class PermutationsFacebook {
    List<List<Integer>> ret = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        helper(nums, new ArrayList<Integer>());
        return ret;
    }
    public void helper(int[] nums, List<Integer> list) {
        if(list.size()==nums.length) {
            ret.add(new ArrayList<>(list));
            return;
        }
        for(int num : nums) {
            if(list.contains(num)) continue;
            list.add(num);
            helper(nums, list);
            list.remove(list.size()-1);
        }
    }
}