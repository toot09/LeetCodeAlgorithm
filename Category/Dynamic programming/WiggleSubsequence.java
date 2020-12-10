// Difficulty : Medium
// Comment : Solved only in twice tries!
// Runtime : 0ms (100%)
class WiggleSubsequence_category {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length==0 || nums==null) return 0;
        int count = 1;
        int state = 0;
        for(int i=1 ; i<nums.length ; i++) {
            int n = nums[i] - nums[i-1];
            if(n==0) {
                continue;
            } else {
                if(n*state<0) {
                    count++;
                } else {
                    if(count==1) count++;
                }
                state = n / Math.abs(n);
            }            
        }
        return count;
    }
}