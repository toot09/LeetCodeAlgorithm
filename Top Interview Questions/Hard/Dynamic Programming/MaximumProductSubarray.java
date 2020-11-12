import java.util.*;
//Runtime: 1 ms (91.05%)
//Memory Usage: 39.1 MB
class MaximumProductSubarray_TIQ {
    public int maxProduct(int[] nums) {
        int[][] arr = new int[nums.length][2];
        int ret = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length ; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = nums[i];
            ret = Math.max(ret, nums[i]);
            if(i==0) continue;
            for(int j=0 ; j<2 ; j++) {
                int num = arr[i-1][j] * nums[i];
                if(num>=0) {
                    arr[i][0] = Math.max(arr[i][0], num);
                    ret = Math.max(ret, arr[i][0]);
                }
                else {
                    arr[i][1] = Math.min(arr[i][1], num);
                }
            }
        }
        return ret;
    }
}