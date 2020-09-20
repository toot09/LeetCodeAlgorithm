class MaximumSubarray_TopInterviewQuestions_DP {
    public int maxSubArray(int[] nums) {
        int maxHere = nums[0];
        int maxFar = nums[0];
        for(int i=1 ; i<nums.length ; i++) {
            maxHere = Math.max(maxHere+nums[i],nums[i]);
            maxFar = Math.max(maxFar,maxHere);
        }
        return maxFar;
    }
}