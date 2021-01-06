// Difficulty : Medium
// Comment : I did it on my own
// url : https://leetcode.com/problems/2-keys-keyboard/
class TwoKeysKeyboard_category {
    public int minSteps(int n) {
        int[] dp = new int[n+1];
        for(int i=1 ; i<=n ; i++) {
            for(int j=i*2 ; j<=n ; j+=i) {
                if(j==i*2) {
                    dp[j] = dp[i]+2;
                } else {
                    dp[j] = dp[j-i]+1;
                }
            }
        }
        return dp[n];
    }
}