// Difficulty : Medium
// Comment : I can do this on my own!!!
// url : https://leetcode.com/problems/maximum-length-of-repeated-subarray/
class MaximumLengthOfRepeatedSubarray_category {
    public int findLength(int[] A, int[] B) {
        int[][] dp = new int[A.length][B.length];
        int ret = 0;
        for(int i=0 ; i<A.length ; i++) {
            for(int j=0 ; j<B.length ; j++) {
                if(A[i]==B[j]) {
                    dp[i][j] = ((i-1>=0&&j-1>=0)?dp[i-1][j-1]:0)+1;
                    ret = Math.max(ret, dp[i][j]);
                }
            }
        }
        return ret;
    }
}