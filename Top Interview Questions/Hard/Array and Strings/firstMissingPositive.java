import java.util.*;

//Hilarious Code!! So impressing
class FirstMissingPositive_TIQ {
    public int firstMissingPositive(int[] nums) {
        int idx = 0;
        while(idx<nums.length) {
            int i = nums[idx]-1;
            if(i>=0 && i<nums.length && i!=idx && nums[i]!=nums[idx]) swap(nums, i, idx);
            else idx++;
        }
        for(int i=0 ; i<nums.length ; i++) {
            if(i+1 != nums[i]) return i+1;
        }
        return nums.length+1;
    }
    public void swap(int[] nums, int idx1, int idx2) {
        int tmp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = tmp;
    }
}

//Runtime: 0 ms (100%)
//Memory Usage: 36.7 MB
/*
class FirstMissingPositive_TIQ {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int ret = 1;
        for(int n : nums) {
            if(n>0) {
                if(ret<n) {
                    break;
                } else {
                    ret = n+1;
                }
            }
        }
        return ret;
    }
}
*/