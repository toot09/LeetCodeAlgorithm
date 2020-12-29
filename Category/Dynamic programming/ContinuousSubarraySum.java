// Difficulty : Medium
// Comment : It's not good problem
// url : https://leetcode.com/problems/continuous-subarray-sum/
//Runtime: 14 ms(22.54%)
//Memory Usage: 39.9 MB(37.39%)
class ContinuousSubarraySum_category {
    public boolean checkSubarraySum(int[] nums, int k) {
        for(int i=0 ; i<nums.length-1 ; i++) {
            int num = nums[i];
            for(int j=i+1; j<nums.length ; j++) {
                num += nums[j];
                if(k==0) {
                    if(num==0) return true;
                } else if(num%k==0) {
                    return true;
                }
            }
        }
        return false;
    }
}