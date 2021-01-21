// 1048. Longest String Chain
// Difficulty : Medium
// Comment : I did it on my own!
// url : https://leetcode.com/problems/longest-string-chain/
import java.util.*;
class LongestStringChain_category {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a,b)->(a.length()-b.length()));
        Map<String, Integer> hm = new HashMap<>();
        int len = words.length, ret=0;
        for(int i=0 ; i<len ; i++) {
            int cnt = 1;
            String word = words[i];
            for(int j=0 ; j<word.length() ; j++) {
                StringBuilder sb = new StringBuilder();
                sb.append(word.substring(0,j));
                sb.append(word.substring(j+1,word.length()));
                String tmp = sb.toString();
                if(hm.containsKey(tmp)) {
                    cnt = Math.max(cnt,hm.get(tmp)+1);
                }
            }
            ret = Math.max(ret, cnt);
            hm.put(word,cnt);
        }
        return ret;
    }
}
/*
// Inefficient code
class LongestStringChain_category {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a,b)->(a.length()-b.length()));
        int len = words.length, ret=0;
        int[] dp = new int[len];
        for(int i=0 ; i<len ; i++) {
            dp[i] = 1;
            for(int j=i-1 ; j>=0 && words[i].length()-words[j].length()<=1 ; j--) {
                if(words[i].length()==words[j].length()) continue;
                for(int k=0 ; k<words[i].length() ; k++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(words[i].substring(0,k));
                    sb.append(words[i].substring(k+1,words[i].length()));
                    if(sb.toString().equals(words[j])) {
                        dp[i] = Math.max(dp[i], dp[j]+1);
                        break;
                    }
                }
            }
            ret = Math.max(ret, dp[i]);
        }
        return ret;
    }
}
*/