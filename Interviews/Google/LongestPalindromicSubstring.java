
// Difficulty : Medium
// Comment : Easy but Didn't remember how to solve it
// url : https://leetcode.com/problems/longest-palindromic-substring/


class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String ret = "";
        for(int i=0; i<s.length() ; i++) {
            int len = Math.max(helper(i,i+1,s), helper(i,i,s));
            if(ret.length()<len) ret = s.substring(i-(len-1)/2, i+len/2+1);
        }
        return ret;
    }
    public int helper(int s, int e, String str) {
        if(s<0 || e>=str.length() || str.charAt(s)!=str.charAt(e)) return 0;
        while(s>=0 && e<str.length() && str.charAt(s)==str.charAt(e)) {
            s--;
            e++;
        }
        return e-s-1;
    }
}
