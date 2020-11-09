import java.util.*;
//Runtime: 4 ms (78.31%)
//Memory Usage: 39.2 MB
class WordBreak_TIQ {
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s.length() < 0 || wordDict.size() <= 0) return false;
        boolean[] dp = new boolean[s.length()];
        for(int i = 0; i < dp.length; i++) {
            for(String w : wordDict) {
                int len = w.length();
                if(i + 1 < len) {
                    continue;
                } else if(i + 1 == len) {
                    if(len <= s.length() && s.substring(0, len).equals(w)) {                    
                        dp[i] = true;
                    }
                } else {
                    if(i + 1 - len >= 0 && dp[i - len]) {
                        if(s.substring(i + 1 - len, i + 1).equals(w)) {
                            dp[i] = true;
                        }
                    }
                }
            }
        }
        return dp[dp.length - 1];
    }
}
// Time Limit Exceeded
/*
class WordBreak_TIQ {
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s.length()<=0 || wordDict.size()<=0) return false;
        Queue<String> q = new LinkedList<>();
        for(String w : wordDict) {
            if(w.length()<=s.length() && w.equals(s.substring(0,w.length()))) {
                q.offer(w);
            }
        }
        while(!q.isEmpty()) {
            String tmp = q.poll();
            if(tmp.equals(s)) return true;
            for(String w : wordDict) {
                String plus = tmp + w;
                if(plus.length() <= s.length() && plus.equals(s.substring(0,plus.length()))) {
                    if(plus.length() == s.length()) return true;
                    q.offer(plus);
                }
            }
        }
        return false;
    }
}
*/