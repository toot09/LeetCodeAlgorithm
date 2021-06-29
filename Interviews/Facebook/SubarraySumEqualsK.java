// Difficulty : Medium
// Comment : Easy
// url : https://leetcode.com/explore/interview/card/facebook/5/array-and-strings/3019/


class SubarraySumEqualsKFacebook {
    public int subarraySum(int[] nums, int k) {
        int cnt = 0;
        for(int i=1; i<nums.length ; i++) {
            nums[i] += nums[i-1];
        }
        for(int i=0 ; i<nums.length ; i++) {
            if(nums[i]==k) cnt++;
            for(int j=0 ; j<i ; j++) {
                if((nums[i]-nums[j])==k) cnt++;
            }
        }
        return cnt;
    }
}