import java.util.*;
//Runtime: 2 ms (41.95%)
//Memory Usage: 39.5 MB
class Permutations_TIQ {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        if(nums.length == 0)
        return ret;
        backtracking(nums, ret, new ArrayList<Integer>());
        return ret;
    }
    public void backtracking(int[] nums, List<List<Integer>> ret, List<Integer> list) {
        List<Integer> tmp = new ArrayList<>();
        for(int n : list) {
            tmp.add(n);
        }
        if(tmp.size() == nums.length) {
            ret.add(tmp);
            return;
        }
        for(int n : nums) {
            if(!tmp.contains(n)) {
                tmp.add(n);
                backtracking(nums, ret, tmp);
                tmp.remove(tmp.size() - 1);
            }
        }
    }
}