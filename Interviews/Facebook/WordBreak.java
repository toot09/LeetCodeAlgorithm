// Difficulty : Medium
// Comment : Easy. I had many tried to solve this problem
// url : https://leetcode.com/problems/word-break/

import java.util.*;
class WordBreakFacebook {
    public boolean wordBreak(String s, List<String> wordDict) {
        //Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
        //Output: false
        //1 <= wordDict[i].length <= 20
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int i=0 ; i<s.length() ; i++) {
            for(int j=Math.max(0,i-20); j<=i ; j++) {
                String word = s.substring(j,i+1);
                if(wordDict.contains(word) && dp[j]) {
                    dp[i+1] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}