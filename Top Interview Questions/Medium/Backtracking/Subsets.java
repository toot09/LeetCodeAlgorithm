import java.util.*;
//Runtime: 1 ms
//Memory Usage: 39.3 MB
class Subsets_TIQ {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        if(nums.length != 0) {
            List<Integer> list = new ArrayList<>();
            backtracking(ret, list, nums, 0);
        }
        return ret;
    }
    public static void backtracking(List<List<Integer>> ret, List<Integer> list, int[] nums, int idx) {
        ret.add(new ArrayList<>(list));
        for(int i = idx; i < nums.length; i++) {
            list.add(nums[i]);
            backtracking(ret, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }

}