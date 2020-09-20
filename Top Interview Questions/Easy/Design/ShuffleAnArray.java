import java.util.*;

class ShuffleAnArray {
    
    private int[] nums;

    public ShuffleAnArray(int[] nums) {
        this.nums = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int len = nums.length;
        int[] ret = new int[len];
        Set<Integer> hs = new HashSet<>();
        for(int i=0;i<len;) {
            int idx = (int)(Math.random()*len);
            if(!hs.contains(idx)) {
                ret[i] = nums[idx];
                hs.add(idx);
                i++;
            }
        }
        return ret;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */