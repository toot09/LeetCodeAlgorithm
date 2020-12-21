// Difficulty : Medium
// comment : I couldn't solve it. Kick point : var cnt, alpha[]
// url : https://leetcode.com/problems/unique-substrings-in-wraparound-string/
class UniqueSubstringsInWraparoundString_category {
    public int findSubstringInWraproundString(String p) {
        int[] alpha = new int[26];
        int cnt = 1;
        for(int i=0 ; i<p.length() ; i++) {
            if(i>0 && (p.charAt(i)-p.charAt(i-1)==1 || p.charAt(i)-p.charAt(i-1)==-25)) {
                cnt++;
            } else {
                cnt = 1;
            }
            alpha[p.charAt(i)-'a'] = Math.max(cnt,alpha[p.charAt(i)-'a']);
        }
        int ret = 0;
        for(int i=0 ; i<26 ; i++) {
            ret += alpha[i];
        }
        return ret;
    }
}