// 131. Palindrome Partitioning
// Difficulty : Medium
// Comment : Wow.... One of most difficult prob.
// url : https://leetcode.com/problems/palindrome-partitioning/
import java.util.*;
class PalindromePartitioning_category {
    public List<List<String>> partition(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        List<List<String>> ret = new ArrayList<>();
        for(int j=0 ; j<len ; j++) {
            for(int i=j ; i>=0 ; i--) {
                if(s.charAt(i)==s.charAt(j) && (j-i<=2 || dp[i+1][j-1])) dp[i][j] = true;
            }
        }
        helper(dp, ret, new ArrayList<String>(), s, 0);
        return ret;    
    }
    public void helper(boolean[][] dp, List<List<String>> ret, List<String> list, String s, int idx) {
        if(idx==s.length()) {
            ret.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx ; i<s.length() ; i++) {
            if(dp[idx][i]) {
                list.add(s.substring(idx,i+1));
                helper(dp, ret, list, s, i+1);
                list.remove(list.size()-1);
            }
        }
    }
}