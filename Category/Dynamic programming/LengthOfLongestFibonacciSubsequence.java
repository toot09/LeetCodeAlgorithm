//873. Length of Longest Fibonacci Subsequence

// Difficulty : Medium
// Comment : Kick is dp[last end point][currnt point]
// url : https://leetcode.com/problems/length-of-longest-fibonacci-subsequence/
//Memory Usage: 48.7 MB
class LengthOfLongestFibonacciSubsequence_category {
    public int lenLongestFibSubseq(int[] arr) {
        int len = arr.length;
        int[][] dp = new int[len][len];
        int ret = 0;
        for(int i=2 ; i<len ; i++) {
            int s=0, e=i-1;
            while(s<e) {
                int sum = arr[s]+arr[e];
                if(sum<arr[i]) {
                    s++;
                } else if(sum>arr[i]) {
                    e--;
                } else {
                    dp[e][i] = Math.max(dp[e][i], dp[s][e]+1);
                    ret = Math.max(ret, dp[e][i]);
                    s++;
                    e--;
                }
            }
        }
        return ret==0?0:ret+2;
    }
}

// Use Two Pointer
//Runtime: 69 ms, faster than 74.44%
//Memory Usage: 39.3 MB,
/*
class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int len = arr.length;
        Set<Integer> hs = new HashSet<>();
        int ret = 0;
        for(int n : arr) hs.add(n);
        for(int i=0 ; i<len-1; i++) {
            for(int j=i+1 ; j<len ; j++) {
                int a=arr[i], b=arr[j], l=2;
                while(hs.contains(a+b)) {
                    ret = Math.max(ret,++l);
                    b = a+b;
                    a = b-a;
                }
            }
        }
        return ret;
    }
}
*/