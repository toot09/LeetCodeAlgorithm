import java.util.*;

//Runtime: 14 ms
//Memory Usage: 41.6 MB
class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ret = 0;
        for(int i = 0 ; i<nums.length ; i = i+2) {
            ret += nums[i];
        }
        return ret;
    }
}

//Runtime: 9 ms
//Memory Usage: 52.6 MB
/*
class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        int[] tmps = new int[20001];
        int ret = 0;
        for(int num : nums) {
            tmps[num+10000]++;
        }
        int chk = 1;
        for(int i=0 ; i<tmps.length;i++) {
            if(tmps[i]>0) {
                chk += tmps[i];
                ret += chk / 2 *(i-10000);
                chk %= 2;
            }
        }
        return ret;
    }
}
*/