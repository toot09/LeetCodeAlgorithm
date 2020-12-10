// Difficulty : Easy
// Comment : Easy!
class IsSubsequence_category {
    public boolean isSubsequence(String s, String t) {
        for(int i=0 ; i<s.length() ; i++) {
            char c = s.charAt(i);
            int idx = t.indexOf(c);
            if(idx==-1) return false;
            t = t.substring(idx+1,t.length());
        }
        return true;
    }
}