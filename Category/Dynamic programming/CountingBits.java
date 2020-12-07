// Difficulty : Medium
//Runtime: 3 ms
//Memory Usage: 44.9 MB
class CountingBits_category {
    public int[] countBits(int num) {
        int[] dp = new int[num+1];
        for(int i=1 ; i<=num ; i++) {
            if(i%2==1) {
                dp[i] = dp[i-1]+1;
            } else {
                dp[i] = dp[i/2];
            }
        }
        return dp;
    }
}

//Runtime: 3 ms
//Memory Usage: 44.9 MB
/*
class Solution {
    public int[] countBits(int num) {
        int[] dp = new int[num+1];
        int i=1, j=0, pow=1;
        while(i<=num) {
            if(j==pow) {
                pow *= 2;
                j = 0;
            }
            dp[i++] = dp[j++]+1;
        }
        return dp;
    }
}
*/