import java.util.*;
//Runtime: 3 ms (99.72)
//Memory Usage: 43.6 MB (82.13%)
class ContainsDuplicate_TIQ {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0) return false;
        Arrays.sort(nums);
        int n = nums[0];
        for(int i=1; i<nums.length ; i++) {
            if(n==nums[i]) return true;
            n = nums[i];
        }
        return false;
    }
}
//Using HashSet Worse than Using Array sort
//Runtime: 6 ms (62.64%)
//Memory Usage: 45 MB (72.13%)
/*
class ContainsDuplicate_TIQ {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<>();
        for(int i=0; i<nums.length ; i++) {
            if(hs.contains(nums[i])) return true;
            hs.add(nums[i]);
        }
        return false;
    }
}
*/