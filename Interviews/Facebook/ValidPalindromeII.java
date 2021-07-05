// Difficulty : Easy
// Comment : Great Prob. I think it is harder than Difficulty and Great
// url : https://leetcode.com/problems/valid-palindrome-ii/


class ValidPalindromeIIFacebook {
    public boolean validPalindrome(String s) {
        return helper(s, 0, s.length()-1, false);
    }
    public boolean helper(String str, int s, int e, boolean diff) {
        if(s>=e) return true;
        while(s<e) {
            if(str.charAt(s)!=str.charAt(e)) {
                if(diff) return false;
                return helper(str, s+1, e, true) || helper(str, s, e-1, true);
            }
            s++;
            e--;
        }
        return true;
    }
}