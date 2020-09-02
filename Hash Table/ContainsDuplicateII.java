import java.util.*;
//Runtime: 6 ms
//Memory Usage: 45.8 MB
class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i=0 ; i < nums.length ; i++) {
            if(hm.containsKey(nums[i]) && (i-hm.get(nums[i]))<=k) {
                return true;    
            }
            hm.put(nums[i],i);
        }
        return false;
    }
}