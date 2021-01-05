// Difficulty : Medium
// Comment : 2D Dynamic Programming (I did on my own!)
// url : https://leetcode.com/problems/palindromic-substrings/
class PalindromicSubstrings_category {
    public int countSubstrings(String s) {
        int ret = 0;
        for(int i=0 ; i<s.length() ; i++) {
            int sum = helper(s, i, i) + helper(s,i,i+1);
            ret += sum;
        }
        return ret;
    }
    
    public int helper(String s, int si, int ei) {
        if(si<0 || ei>= s.length()) return 0;
        int ret = 0;
        while(si>=0 && ei<s.length() && s.charAt(si)==s.charAt(ei)) {
            ret++;
            si--;
            ei++;
        }
        return ret;
    }
}

// Use DP (worse than up code)
/*
class PalindromicSubstrings_category {
    public int countSubstrings(String s) {
        char[] c = s.toCharArray();
        boolean[][] dp = new boolean[c.length][c.length];
        int ret = 0;
        for(int j=0 ; j<c.length ; j++) {
            dp[j][j] = true;
            ret++;
            for(int i=j-1 ; i>=0 ; i--) {
                if(s.charAt(i) == s.charAt(j)) {
                    if(dp[i+1][j-1]==true || j-i==1) {
                        dp[i][j] = true;
                        ret++;
                    }
                }
            }
        }
        return ret;
    }
}
*/