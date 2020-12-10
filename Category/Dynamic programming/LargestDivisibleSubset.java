// Difficult : Medium
// Comment : I couldn't this but understood.
// https://leetcode.com/problems/largest-divisible-subset/
import java.util.*;
class LargestDivisibleSubset_category {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> ret = new ArrayList<>();
        if(nums.length==0 || nums==null) return ret;
        int[] count = new int[nums.length];
        int[] pre = new int[nums.length];
        int idx = -1, max=1;
        Arrays.sort(nums);
        for(int i=0 ; i<nums.length ; i++) {
            count[i] = 1;
            pre[i] = -1;
            for(int j=i-1 ; j>=0 ; j--) {
                if(nums[i]%nums[j]==0) {
                    if(count[j]+1 > count[i]) {
                        pre[i] = j;
                        count[i] = count[j]+1;
                    }
                }
            }
            if(max<count[i]) {
                idx = i;
                max = count[i];
            }
        }
        if(idx==-1) ret.add(nums[0]);
        while(idx!=-1) {
            ret.add(nums[idx]);
            idx = pre[idx];
        }
        return ret;
    }
}