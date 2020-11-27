// Difficulty : Medium
// Inefficient code but I did on my own.
import java.util.*;
class WordBreak_category {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int i=1 ; i<dp.length ; i++) {
            helper(dp, wordDict, s, i);
        }
        return dp[dp.length-1];
    }
    
    public void helper(boolean[] dp, List<String> wordDict, String s, int idx) {
        for(int j=0 ; j<idx ; j++) {
            String tmp = s.substring(j,idx);
            if(dp[j] && wordDict.contains(tmp)) {
                dp[idx] = true;
                return;
            }
        }
        return;
    }
}