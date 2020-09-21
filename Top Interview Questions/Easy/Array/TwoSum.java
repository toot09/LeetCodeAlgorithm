import java.util.*;
//Runtime: 1 ms (99.95%)
//Memory Usage: 39.9 MB (36.43%)
class TwoSum_TIQ {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        int[] ret = new int[2];
        for(int i=0 ; i<nums.length ; i++) {
            int num = nums[i];
            if(hm.containsKey(target-num)) {
                ret[0] = hm.get(target-num);
                ret[1] = i;
                break;
            }
            hm.put(num,i);
        }
        return ret;
    }
}