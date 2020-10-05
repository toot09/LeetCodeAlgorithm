//Runtime: 23 ms (87.75%)
//Memory Usage: 37.7 MB (89.75%)
class LongestPalindromicSubstring_study {
    public String longestPalindrome(String s) {
        if(s.length()==0) return "";
        int start = 0;
        int end = 0;
        for(int i=0 ; i<s.length() ; i++) {
            int len1 = expendString(s,i,i);
            int len2 = expendString(s,i,i+1);
            int len = Math.max(len1,len2);
            if(end-start < len) {
                start = i-(len-1)/2;
                end = i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
    public int expendString(String s, int l, int r) {
        int left = l;
        int right = r;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)) {
            l--;
            r++;
        }
        return r-l-1;
    }
}

//Runtime: 24 ms (73.11%)
//Memory Usage: 39 MB (66.38%)
/*
class LongestPalindromicSubstring_study {
    public String longestPalindrome(String s) {
        String ret = "";
        for(int i=0 ; i<s.length() ; i++) {
            int len1 = expendString(s,i,i);
            int len2 = expendString(s,i,i+1);
            int len = Math.max(len1,len2);
            if(ret.length() < len) {
                ret = s.substring(i-(len-1)/2 , i+len/2+1);
            }
        }
        return ret;
    }
    public int expendString(String s, int l, int r) {
        int left = l;
        int right = r;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)) {
            l--;
            r++;
        }
        return r-l-1;
    }
}
*/